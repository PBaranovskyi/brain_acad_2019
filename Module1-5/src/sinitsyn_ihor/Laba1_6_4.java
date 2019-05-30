package sinitsyn_ihor;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Laba1_6_4 {
    public static void main(String[] args) {
        int[] myArray = new int[100];
        for (int iterative = 0; iterative < myArray.length; iterative++) {
            int num = iterative;
            myArray[num] = iterative+1;
        }
        shuffleArray(myArray);
        System.out.println(Arrays.toString(myArray));
        System.out.print("Enter your number from 1 to 100: ");
        Scanner scanValue = new Scanner(System.in);
        int myValue = scanValue.nextInt();
        if (myValue < 1 || myValue > 100) {
            System.out.println("Error! Your number is out of values limits!");
        } else {
            int myIndex = Arrays.binarySearch(myArray, myValue);
            System.out.println("Your value " + myValue + " has index " + myIndex);
        }
    }

    static void shuffleArray(int[] ar) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}
