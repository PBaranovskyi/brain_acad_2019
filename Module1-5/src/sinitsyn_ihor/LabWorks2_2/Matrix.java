package sinitsyn_ihor.LabWorks2_2;

import java.util.Scanner;

public class Matrix {

    private int[][] myArr;
    private int[][] additionOfArr;
    private int[][] multiplicationOfArr;

    public int[][] getFirstArr() {
        return firstArr;
    }

    public void setFirstArr(int[][] firstArr) {
        this.firstArr = firstArr;
    }

    public int[][] getSecondArr() {
        return secondArr;
    }

    public void setSecondArr(int[][] secondArr) {
        this.secondArr = secondArr;
    }

    private int[][] firstArr;
    private int[][] secondArr;

    public int[][] getAdditionOfArr() {
        return additionOfArr;
    }

    private void setAdditionOfArr(int[][] additionOfArr) {
        this.additionOfArr = additionOfArr;
    }

    public int[][] getMultiplicationOfArr() {
        return multiplicationOfArr;
    }

    public int[][] getMyArr() { return myArr; }

    // Создаем случайный массив в указанном диапазоне
    public Matrix(int[][] myArr) {
        int rows = 0;
        int columns = 0;
        int[][] newArr = new int[rows][columns];
        System.out.println("Введите количество строк в матрице: ");
        Scanner scan = new Scanner(System.in);
        rows = scan.nextInt();
        System.out.println("Теперь введите количество столбцов в матрице: ");
        columns = scan.nextInt();
        System.out.println("Задайте максимальную границу для рандомизации (от 1 до ...): ");
        int randomBorder = scan.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArr[i][j] = (int) (Math.random() * randomBorder);
            }
        }
        this.myArr = myArr;
    }

    private void setMultiplicationOfArr(int[][] multiplicationOfArr) {
        for (int i = 0; i < firstArr.length && i < secondArr.length; i++) {
            for (int j = 0; j < firstArr[i].length && j < secondArr.length; j++) {
                multiplicationOfArr[i][j] = firstArr[i][j] + secondArr[i][j];
            }
        }
        this.multiplicationOfArr = multiplicationOfArr;
    }
}
