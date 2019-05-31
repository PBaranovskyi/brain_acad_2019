package bilan_max;

import java.util.Random;

public class TestArrays {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        Random rand = new Random();
        int nextInt = rand.nextInt(1000);
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = i*i;
        for (int[] anArr : arr) {
            for (int anAnArr : anArr) {
                System.out.printf("%02d | ", anAnArr);
            }
            System.out.println();
        }
    }
}
