package mykhailo_kaloshyn.mainacad.lab2_2.matrixOperations;

import java.util.Random;
import java.util.Scanner;

public class MatrixObjects {

    private MatrixObjects(){
    }

    static int[][] additionMatrixes(int[][] arr1, int[][] arr2) {
        int a1 = arr1.length;
        int a2 = arr2.length;
        int a3 = a2;
        if (a1 > a2) {
            a3 = a1;
        }
        int b1 = arr1[1].length;
        int b2 = arr2[1].length;
        int b3 = b2;
        if (b1 > b2) {
            b3 = b1;
        }
        int[][] arr3 = new int[a3][b3];
        for (int i = 0; i < a3; i++) {
            for (int j = 0; j < b3; j++) {
                if (i <= (a1 - 1) && j <= (b1 - 1)) {
                    arr3[i][j] += arr1[i][j];
                }
                if (i <= (a2 - 1) && j <= (b2 - 1)) {
                    arr3[i][j] += arr2[i][j];
                }
            }
        }
        return arr3;
    }

    static int[][] multilpyingMatrixes(int[][] arr1, int[][] arr2) {
        int a1 = arr1.length;
        int a2 = arr2.length;
        int a3 = a2;
        if (a1 > a2) {
            a3 = a1;
        }
        int b1 = arr1[1].length;
        int b2 = arr2[1].length;
        int b3 = b2;
        if (b1 > b2) {
            b3 = b1;
        }
        int[][] arr3 = new int[a3][b3];
        for (int i = 0; i < a3; i++) {
            for (int j = 0; j < b3; j++) {
                if (i <= (a1 - 1) && i <= (a2 - 1) && j <= (b1 - 1) && j <= (b2 - 1)) {
                    arr3[i][j] = arr1[i][j] * arr2[i][j];
                }
            }
        }
        return arr3;
    }

    static void displayMatrix(int[][] someArr) {
        for (int j = 0; j < someArr[1].length; j++) {
            for (int i = 0; i < someArr.length; i++) {
                System.out.printf("%4d", someArr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                System.out.print("Input number of elements in Matrix_1: ");
            } else if (i == 1) {
                System.out.print("Input number of inside elements within each element of Matrix_1: ");
            } else if (i == 2) {
                System.out.print("Input number of elements in Matrix_2: ");
            } else {
                System.out.print("Input number of inside elements within each element of Matrix_2: ");
            }
            Scanner matrixDimension = new Scanner(System.in);
            arr[i] = matrixDimension.nextInt();
        }

        Matrix newMatrix1 = new Matrix();
        newMatrix1.setNumOfElements(arr[0]);
        newMatrix1.setNumOfElementsWithin(arr[1]);

        Matrix newMatrix2 = new Matrix();
        newMatrix2.setNumOfElements(arr[2]);
        newMatrix2.setNumOfElementsWithin(arr[3]);

        int[][] arrNewMatrix1 = new int[newMatrix1.getNumOfElements()][newMatrix1.getNumOfElementsWithin()];
        for (int i = 0; i < newMatrix1.getNumOfElements(); i++) {
            for (int j = 0; j < newMatrix1.getNumOfElementsWithin(); j++) {
                Random rand = new Random();
                arrNewMatrix1[i][j] = rand.nextInt(10);
            }
        }

        System.out.println();

        int[][] arrNewMatrix2 = new int[newMatrix2.getNumOfElements()][newMatrix2.getNumOfElementsWithin()];
        for (int i = 0; i < newMatrix2.getNumOfElements(); i++) {
            for (int j = 0; j < newMatrix2.getNumOfElementsWithin(); j++) {
                Random rand = new Random();
                arrNewMatrix2[i][j] = rand.nextInt(10);
            }
        }

        displayMatrix(arrNewMatrix1);
        displayMatrix(arrNewMatrix2);
        System.out.println("Addition of matrixes result: ");
        displayMatrix(additionMatrixes(arrNewMatrix1, arrNewMatrix2));
        System.out.println("Multiplying of matrixes result: ");
        displayMatrix(multilpyingMatrixes(arrNewMatrix1, arrNewMatrix2));
    }
}

