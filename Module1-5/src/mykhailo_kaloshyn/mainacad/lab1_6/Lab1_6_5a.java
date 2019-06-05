package mykhailo_kaloshyn.mainacad.lab1_6;

import java.util.Arrays;

public class Lab1_6_5a {
    public static void main(String[] args) {

        int[][] marr = new int[4][4];
        int[][] transposedMatrix = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                marr[i][j] = (i + 1) + 4 * j;
                transposedMatrix[j][i] = marr[i][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(marr[i]));
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(transposedMatrix[i]));
        }
    }
}

