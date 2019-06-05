package mykhailo_kaloshyn.mainacad.lab1_6;

import java.util.Arrays;
import java.util.Scanner;

public class Lab1_6_7b {
    public static void main(String[] args) {
        int[][] mArr = {{1, 1, 1, 3, 4}, {2, 1, 3, 1, 2}, {2, 2, 3, 4, 1}, {3, 3, 3, 1, 4}};
        System.out.println("Enter the number: ");
        Scanner requestedNumber = new Scanner(System.in);
        int num = requestedNumber.nextInt();
        for (int i = 1; i <= mArr.length; i++) {
            int counter = 0;
            System.out.print("Line " + i + ":");
            for (int j = 0; j <= 4; j++) {
                if (mArr[i - 1][j] == num) {
                    counter++;
                }
            }
            int[] arr = new int[counter];
            int counter2 = 0;
            for (int j = 0; j <= 4; j++) {
                if (mArr[i - 1][j] == num) {
                    arr[counter2] = j;
                    counter2++;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
