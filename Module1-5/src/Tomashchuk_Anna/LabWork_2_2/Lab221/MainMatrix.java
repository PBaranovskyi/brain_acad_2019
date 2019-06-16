package LabWork_2_2.Lab221;

import java.util.Arrays;

public class MainMatrix {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 3, 2}, {5, 1, 3}};
        int[][] arr2 = {{2, 3, 1}, {1, 1, 4}, {1, 2, 1}};

        Matrix matrix = new Matrix();
        Matrix matrix2 = new Matrix();

        matrix.setInnitial(arr1);
        matrix2.setInnitial(arr2);

        int[][] sum = matrix.add(matrix2);
        System.out.println("Addition of matrices: "); // Суммирование
        System.out.println(Arrays.deepToString(sum));
        System.out.println();


        Matrix matrix3 = new Matrix();
        Matrix matrix4 = new Matrix();

        matrix3.setMult(arr1);
        matrix4.setMult(arr2);

//  multiplication Можно назвать по-другому это просто переменная
        int[][] mult = matrix3.multiplication(matrix4);
        System.out.println("Multiplication of matrices: "); // Умножение
        System.out.println(Arrays.deepToString(mult));


    }
}
