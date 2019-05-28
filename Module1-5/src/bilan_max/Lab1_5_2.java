package bilan_max;
import java.util.Scanner;

public class Lab1_5_2 {
    public static void main(String[] args) {
        int x = 1;
        while (x > 0) {
            System.out.println("Enter number x:");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            if (number == 1) {
                System.out.println("One");
            }
            if (number == 2) {
                System.out.println("Two");
            }
            if (number == 3) {
                System.out.println("Three");
            }
            if (number == 4) {
                System.out.println("Four");
            }
            if (number == 5) {
                System.out.println("Five");
            }
            if (number == 6) {
                System.out.println("Six");
            }
            if (number == 7) {
                System.out.println("Seven");
            }
            if (number == 8) {
                System.out.println("Eight");
            }
            if (number == 9) {
                System.out.println("Nine");
            } else if (number > 9) {
                System.out.println("Others");
            }
        }
    }
}




