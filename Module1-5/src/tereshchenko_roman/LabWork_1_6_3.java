package com.brainacad.controlFlowStatements.Arrays;

import java.util.Arrays;

public class LabWork_1_6_3 {
    public static void main(String[] args) {
        int arr[][] = {{1, 5, 9, 13}, {2, 6, 10, 14}, {3, 7, 11, 15}, {4, 8, 12, 16}};
        for (int n = 0; n < 4; n++) {
            for (int m = 0; m < 4; m++) {
                System.out.print(arr[n][m] + "  ");
            }
            System.out.println();
        }
    }
}
