package sinitsyn_ihor.HomeWorks;

import java.util.Arrays;
import java.util.Random;

public class HomeWork18 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random myRand = new Random();
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            arr[i] = myRand.nextInt(100);
            i++;
        }
        System.out.println("Our array: " + Arrays.toString(arr));
        int max = arr[0];
//        With WHILE loop:
//        while (j < arr.length) {
//            if (max < arr[j]) {
//                max = arr[j];
//            }
//            j++;
//        }
//        With DO-WHILE loop:
        do {
            if (max < arr[j]) {
                max = arr[j];
            }
            j++;
        } while (j < arr.length);
        System.out.println("Maximum value: " + max);
    }
}
