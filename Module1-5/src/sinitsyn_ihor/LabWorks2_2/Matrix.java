package sinitsyn_ihor.LabWorks2_2;

import java.util.Scanner;

public class Matrix {

    int[][] myArray;
    int rows = 0;
    int columns = 0;

    // Создаем случайный массив в указанном диапазоне
    public void generateMatrix() {
        System.out.print("Введите количество строк в матрице: ");
        Scanner scan = new Scanner(System.in);
        rows = scan.nextInt();
        System.out.println();
        System.out.print("Теперь введите количество столбцов в матрице: ");
        columns = scan.nextInt();
        System.out.println();
        System.out.print("Задайте максимальную границу для рандомизации (от 1 до 99): ");
        int randomBorder = scan.nextInt();
        System.out.println();
//        if (randomBorder <= 0 && randomBorder >= 100) {
//            System.out.println("Randomization error!");
//        }
//        else {
        int[][] newArray = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newArray[i][j] = (int) (Math.random() * randomBorder + 1);
            }
        }
        this.myArray = newArray;
//        }
    }

    //Создаем массив с максимальными строками и столбацами, заполняем его результатами добавления.
    public void additionOfArr(int[][] arr1, int[][] arr2) {
        rows = Math.max(arr1.length, arr2.length);
        columns = Math.max(arr1[0].length, arr2[0].length);
        int[][] newArray = new int[rows][columns];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                newArray[i][j] += arr1[i][j];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                newArray[i][j] += arr2[i][j];
            }
        }
        this.myArray = newArray;
    }

    //Создаем массив с минимальными строками и столбацами, заполняем его результатами умножения.
    public void multiplicationOfArr(int[][] arr1, int[][] arr2) {
        rows = Math.min(arr1.length, arr2.length);
        columns = Math.min(arr1[0].length, arr2[0].length);
        int[][] newArray = new int[rows][columns];
        int sum = 0;
        int mult = 0;
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[0].length; j++) {
                sum = arr1[i][j] * arr2[j][i];
                newArray[i][j] += sum;
            }
        }
        this.myArray = newArray;
    }

    public void arrayToPrint() {
        for (int i = 0; i < this.myArray.length; i++) {
            for (int j = 0; j < this.myArray[0].length; j++) {
                if (this.myArray[i][j] > 0)
                    System.out.printf("%02d ", this.myArray[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] getMyArray() {
        return myArray;
    }
}
