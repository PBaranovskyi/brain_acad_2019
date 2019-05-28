package mykhailo_kaloshyn.mainacad.lab1_5;

import java.util.Scanner;

public class Lab1_5_5 {
    public static void main(String[] args) {
        System.out.println("Please, enter the number: ");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        int sumOfNumbers = 0;
        for (int i = 1; i <= n; i++) {
            sumOfNumbers += i;
        }
        System.out.println("Summ of numbers in between 0 and " + n + " is equal to: " + sumOfNumbers);
        System.out.println("Average of numbers in between 0 and " + n + " is equal to: " + sumOfNumbers/(double)n);
    }
}
