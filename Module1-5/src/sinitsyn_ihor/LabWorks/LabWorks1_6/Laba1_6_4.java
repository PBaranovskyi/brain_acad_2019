package sinitsyn_ihor.LabWorks.LabWorks1_6;

import java.util.Arrays;
import java.util.Scanner;

public class Laba1_6_4 {
    public static void main(String[] args) {
        int[] myArray = new int[100];
        for (int iterative = 0; iterative < myArray.length; iterative++) {
            int num = iterative;
            myArray[num] = iterative + 101;
        }
        System.out.print("Enter your number from 101 to 200: ");
        Scanner scanValue = new Scanner(System.in);
        int myValue = scanValue.nextInt();
        if (myValue < 100 || myValue > 200) {
            System.out.println("Error! Your number is out of values limits!");
        } else {
            int myIndex = Arrays.binarySearch(myArray, myValue);
            System.out.println("Your value " + myValue + " has index " + myIndex);
        }


    }
}
