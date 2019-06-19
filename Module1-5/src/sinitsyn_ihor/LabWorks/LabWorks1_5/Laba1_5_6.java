package sinitsyn_ihor.LabWorks.LabWorks1_5;

import java.util.Scanner;

public class Laba1_5_6 {

    public static void main(String[] args) {
        int myResult = 0;
        System.out.println("The program calculates the sum of squares of digits of number.");
        System.out.print("Please, enter the number Х (within the limits of Int type): ");
        Scanner scanner = new Scanner(System.in);
        Integer myNumber = scanner.nextInt();
//        myNumber = Math.abs(myNumber);
        String numberToString = myNumber.toString();
        int maxSymbols = numberToString.length();
        for (int iterative = 0; iterative < maxSymbols; iterative++) {
            char myChar = numberToString.charAt(iterative);
            int numberToInt = Character.getNumericValue(myChar);
            myResult = myResult + numberToInt * numberToInt;
        }
        System.out.println("Your result: " + myResult);
    }
}