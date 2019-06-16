package LabWork_2_2.Lab221;

import java.util.Arrays;

public class MainSample_Pavel {
    public static void main(String[] args) {

        int[][] arr1 = {{1, 1, 2}, {2, 3, 2}, {3, 4, 2}};

        int[][] arr2 = {{1, 3, 4}, {3, 1, 1}, {5, 1, 1}};

        Matrix matrix = new Matrix();
        Matrix matrix2 = new Matrix();

        matrix.setInnitial(arr1);
        matrix2.setInnitial(arr2);

        //К первой матрице прибавляем вторую
        int[][] sum = matrix.add(matrix2);

        //Ко второй матрице прибавляем вротую
        int[][] sum2 = matrix2.add(matrix);

        // ненважно в какой последовательности прибавляются матрицы - результат удет одинаковый
        System.out.println(Arrays.deepToString(sum));
        System.out.println(Arrays.deepToString(sum2));

    }
}
