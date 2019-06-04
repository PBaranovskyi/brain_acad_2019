package mykhailo_kaloshyn.mainacad.lab1_6;

import java.util.Arrays;
import java.util.Scanner;

public class Lab1_6_6 {
    public static void main(String[] args) {
        Scanner monthTemp = new Scanner(System.in);
        double[] tempArr = new double[12];
        for (int i = 1; i <= 12; i++) {
            System.out.println("Enter the average temperature in month " + i + ", 2015");
            tempArr[i - 1] = monthTemp.nextDouble();
        }
        System.out.println(Arrays.toString(tempArr));
        Arrays.sort(tempArr);
        System.out.println(Arrays.toString(tempArr));
    }
}
