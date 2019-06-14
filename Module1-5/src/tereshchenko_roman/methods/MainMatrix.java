package com.brainacad.methods;

import java.util.Arrays;

public class MainMatrix {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix();
        int[][] arr1 = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        int[][] arr2 = {{2, 3, 4}, {3, 4, 5}, {5, 6, 7}};
        matrix1.add();
        matrix1.mult();
        System.out.println(Arrays.toString(matrix1.add()));
        System.out.println(Arrays.toString(matrix1.mult()));
    }
}

