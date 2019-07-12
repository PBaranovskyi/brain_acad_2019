package Tomashchuk_Anna.LabWork_2_2_Methods.Sample_Multiplication;

import java.util.Arrays;

public class MainMatrix {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 3, 2}, {5, 1, 3}};
        int[][] arr2 = {{2, 3, 1}, {1, 1, 4}, {1, 2, 1}};

        Matrix matrix=new Matrix();
        Matrix matrix2=new Matrix();

        matrix.setMult(arr1);
        matrix2.setMult(arr2);
//  multiplication Можно назвать по-другому это просто переменная
        int[][] mult=matrix.multiplication(matrix2);
        System.out.println(Arrays.deepToString(mult));



    }
}
