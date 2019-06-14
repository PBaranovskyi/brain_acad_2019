package com.brainacad.methods;

import java.util.Arrays;

public class Matrix {
    int[][] arr1 = new int[3][3];
    int[][] arr2 = new int[3][3];

    public int[][] add() {
        int[][] sum = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return sum;
    }

    public int[][] mult() {
        int[][] prod = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                prod[i][j] = arr1[i][j] * arr2[i][j];
            }
        }
        return prod;
    }
}
