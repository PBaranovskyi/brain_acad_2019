package com.brainacad.arrays;

import java.util.Random;

public class ClassWorkRandom {
    public static void main(String[] args) {

        int[][] arr1 = new int[10][10];

        Random rand = new Random();

        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                arr1[a][b] = rand.nextInt(100) + 1;
                System.out.printf("%4d", arr1[a][b]);
            }
            System.out.println();
        }
    }
}
