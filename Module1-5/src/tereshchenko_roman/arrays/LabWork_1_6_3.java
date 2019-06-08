package com.brainacad.arrays;

public class LabWork_1_6_3 {
    public static void main(String[] args) {
        int arr[][] = new int[4][4];

        for (int n = 0; n < 4; n++) {
            for (int m = 1; m < 5; m++) {
                System.out.printf("%4d", (arr[m-1][(n)] = (m + (3*(m-1))) + (n)));
            }
            System.out.println();
        }
    }
}