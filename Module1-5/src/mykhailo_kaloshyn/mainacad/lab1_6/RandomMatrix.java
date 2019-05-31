package mykhailo_kaloshyn.mainacad.lab1_6;

import java.util.Random;

public class RandomMatrix {
    public static void main(String[] args) {
        int myArr[][] = new int[10][10];
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                Random rand = new Random();
                int nextInt = rand.nextInt(1000);
                myArr[j][i] = nextInt;
                System.out.printf("%7d", myArr[j][i]);
                if (j == 9) {
                    System.out.println();
                }
            }
        }
    }
}
