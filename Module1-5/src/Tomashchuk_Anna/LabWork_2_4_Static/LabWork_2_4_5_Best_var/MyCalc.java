package Tomashchuk_Anna.LabWork_2_4_Static.LabWork_2_4_5_Best_var;

import java.util.Scanner;

public class MyCalc {
    private static double divider = 3;
    private static double pi = 4;

    public static double calcPi(int number) {
        for (int i = 0; i < number; i++) {
            double addict = 4 / divider;
            if (i%2==0) {
                pi -= addict;
            } else {
                pi += addict;
            }
            divider += 2;
//            System.out.println("Pi = " + pi + " addict = " + addict + " divider = " + divider);
        }
        return pi;
    }

    public static double getPi() {
        return pi;
    }
}
