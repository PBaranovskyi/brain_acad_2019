package sinitsyn_ihor.LabWorks2_2;

public class MainMethod {
    public static void main(String[] args) {
        System.out.println("Задайте первый массив.");
        Matrix firstArr = new Matrix();
        firstArr.generateMatrix();
        int[][] arr1 = firstArr.getMyArray();
        System.out.println("Сейчас задайте второй массив:");
        Matrix secondArr = new Matrix();
        secondArr.generateMatrix();
        int[][] arr2 = secondArr.getMyArray();
        System.out.println("Первая матрица: ");
        firstArr.arrayToPrint();
        System.out.println("Вторая матрица");
        secondArr.arrayToPrint();
        System.out.println("Результат суммирования матриц: ");
        Matrix thirdArr = new Matrix();
        thirdArr.additionOfArr(arr1, arr2);
        thirdArr.arrayToPrint();
        System.out.println("Результат умножения матриц: ");
        Matrix fourthArr = new Matrix();
        fourthArr.multiplicationOfArr(arr1, arr2);
        fourthArr.arrayToPrint();
    }
}
