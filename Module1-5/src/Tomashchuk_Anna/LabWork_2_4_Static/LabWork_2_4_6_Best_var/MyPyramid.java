package Tomashchuk_Anna.LabWork_2_4_Static.LabWork_2_4_6_Best_var;

import java.util.Scanner;

public class MyPyramid {

    public static void  printPyramid(int a) {

        int h = a;

        for (int i = 0; i >= 0; i++) {
            if (h > 9 || h < 1) {
                System.out.print("Enter int h as of 1 till 9 inclusively: ");
                Scanner scan = new Scanner(System.in);
                h = scan.nextInt();
            } else {
                break;
            }
        }

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    int f = h + 1 - i;
                    String ff = "%" + f + "d";
                    System.out.printf(ff, j);
                } else {
                    System.out.print(j);
                }
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

}
