package com.brainacad.arrays.arrays_Add_Home_Works;

public class Add_Home_Work_22 {
    public static void main(String[] args) {

        int[][] mArr = new int[5][5];

        int n = 1;
        int i = 0;

        while (i < 5) {
            int j = 0;
            while (j < 5) {
                mArr[i][j] = n;
                n++;
                System.out.print(mArr[i][j] + " ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
