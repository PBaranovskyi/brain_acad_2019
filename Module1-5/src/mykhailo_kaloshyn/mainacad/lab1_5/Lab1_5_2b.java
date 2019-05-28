package mykhailo_kaloshyn.mainacad.lab1_5;

import java.util.Scanner;

public class Lab1_5_2b {
    public static void main(String[] args) {
        System.out.println("Please, enter an integer number: ");
        Scanner number = new Scanner(System.in);
        int x = number.nextInt();
        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Other");
        }
    }
}
