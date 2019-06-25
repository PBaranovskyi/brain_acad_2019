package Tomashchuk_Anna.LabWork_2_4_Static.LabWork_2_4_6;

import java.util.Scanner;

public class MyPyramid_2 {

    public static int printPyramid(int hight) {
        for (int i = 0; i < hight; i++) {
            int numb = 0;
            int check = 0;
            for (int j = (i + 1) * 2 - 1; j > 0; j--) {
                if (check <= j) {
                    numb++;
                    System.out.print(numb);
                    check++;
                } else {
                    numb--;
                    System.out.print(numb);
                    check++;
                }
            }
            System.out.println();
        }
        return hight;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Задайте высоту пирамиды (от 1 до 9): ");
        int h = scan.nextInt();
        if (h > 9 || h < 1) {
            System.out.println("Error!");
        } else {
            MyPyramid_2.printPyramid(h);
        }
    }
}
