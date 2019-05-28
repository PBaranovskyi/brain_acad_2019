package mykhailo_kaloshyn.mainacad.lab1_5;

import java.util.Scanner;

public class Lab1_5_2a {
    public static void main(String[] args) {
        System.out.println("Please, enter an integer number: ");
        Scanner number = new Scanner(System.in);
        int x = number.nextInt();
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
        } else {
            System.out.println("Other");
        }
    }
}
