package mykhailo_kaloshyn.mainacad.lab1_4;

import java.util.Scanner;

public class Lab1_4_7 {
    public static void main(String[] args) {
        System.out.println("Please, enter to Integer numbers:");
        Scanner number = new Scanner(System.in);
        double a = number.nextDouble();
        double b = number.nextDouble();
        double maxNumber = a > b ? a : b;
        System.out.println("The biggest from entered numbers is: " + maxNumber);
    }
}
