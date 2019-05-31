package com.brainacad.controlFlowStatements.Arrays;

import java.util.Arrays;

public class LabWork_1_6_5 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 3, 5, 7}, {2, 8, 15, 82}, {21, 53, 12, 42}, {7, 7, 8, 19}};

            int[][] arr2 = new int[4][4];
            for (int m = 0; m < 4; m++)
                for (int n = 0; n < 4; n++)
                    arr2[n][m] = arr1[m][n];

            for (int c = 0; c < 4; c++) {
                for (int d = 0; d < 4; d++) {
                    System.out.print(arr2[c][d] + "  ");
                }
                System.out.println();
            }
        }
    }

