package Tereshchenko;

import java.util.Scanner;

public class LabWork_1_5_2 {
    public static void main(String[] args) {
        System.out.println("Enter number x");
        Scanner sc = new Scanner(System.in);
        Integer line = sc.nextInt();
        int x = line;
        if (x == 1) {
            System.out.println("One");
        } else if (x == 2) {
            System.out.println("Two");
        } else if (x == 3) {
            System.out.println("Three");
        } else if (x == 4) {
            System.out.println("Four");
        } else if (x == 5) {
            System.out.println("Five");
        } else if (x == 6) {
            System.out.println("Six");
        } else if (x == 7) {
            System.out.println("Seven");
        } else if (x == 8) {
            System.out.println("Eight");
        } else if (x == 9) {
            System.out.println("Nine");
        } else if (x > 9) {
            System.out.println("Other");
        } else {
        }
    }
}
