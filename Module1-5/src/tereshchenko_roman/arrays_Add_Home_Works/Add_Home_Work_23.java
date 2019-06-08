package com.brainacad.arrays.arrays_Add_Home_Works;

public class Add_Home_Work_23 {
    public static void main(String[] args) {

        int[][] mArr = new int[5][5];

        int n = 25;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mArr[i][j] = n;
                n--;
                System.out.printf("%4d@, mArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
