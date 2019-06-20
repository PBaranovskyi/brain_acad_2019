package sinitsyn_ihor.LabWorks.LabWorks2_4;

import java.util.Random;

public class MyMath {

    private static int minVal;
    private static int maxVal;
    private int[] arr;
    private int[][] matrix;
    private static double square;
    private final static double Pi = 3.14;
    Random rand = new Random();

    public static double areaOfCircle(double rad) {
        square = Pi * rad * rad;
        return square;
    }

    public void setMatrix() {
        int rows = rand.nextInt(5) + 5;
        int columns = rand.nextInt(5) + 5;
        int[][] newMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newMatrix[i][j] = rand.nextInt(100);
            }
        }
        this.matrix = newMatrix;
    }

    public void setArr() {
        int rows = rand.nextInt(5) + 10;
        int[] newArr = new int[rows];
        for (int i = 0; i < rows; i++) {
            newArr[i] = rand.nextInt(100);
        }
        this.arr = newArr;
    }

    public static int findMin(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (temp > arr[i]) {
                temp = arr[i];
            }
        }
        minVal = temp;
        return minVal;
    }

    public static int findMin(int[][] matrix) {
        int temp = matrix[0][0];
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                if (temp > matrix[i][j]) {
                    temp = matrix[i][j];
                }
            }
        }
        minVal = temp;
        return minVal;
    }

    public static int findMax(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }
        maxVal = temp;
        return maxVal;
    }

    public static int findMax(int[][] matrix) {
        int temp = matrix[0][0];
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                if (temp < matrix[i][j]) {
                    temp = matrix[i][j];
                }
            }
        }
        maxVal = temp;
        return maxVal;
    }

    public int[] getArr() {
        return arr;
    }

    public int[][] getMatrix() {
        return matrix;
    }
}
