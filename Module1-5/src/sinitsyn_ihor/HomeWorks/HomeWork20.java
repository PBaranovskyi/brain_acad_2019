package sinitsyn_ihor.HomeWorks;

import java.util.Arrays;
import java.util.Random;

public class HomeWork20 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random myRand = new Random();
        int sum = 0;
        int i = 0;
//        With WHILE loop:
//        while (i < arr.length) {
//            arr[i] = myRand.nextInt(100);
//            sum += arr[i];
//            i++;
//        }
//        With DO-WHILE loop:
        do {
            arr[i] = myRand.nextInt(100);
            sum += arr[i];
            i++;
        } while (i < arr.length);
        System.out.println("Our array: " + Arrays.toString(arr));
        System.out.println("Sum: " + sum);
    }
}
