package sinitsyn_ihor.HomeWorks;

import java.util.Arrays;
import java.util.Random;

public class HomeWork16 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i = 0;
        Random myRand = new Random();
        while (i < arr.length) {
            arr[i] = myRand.nextInt(100);
            i++;
        }
        System.out.println("Our array is: " + Arrays.toString(arr));
        int j = 0;
        int min = arr[0];
//        With WHILE loop:
//        while (j < arr.length) {
//            if (min > arr[j]){
//                min = arr[j];
//            }
//            j++;
//        }
//        With DO-WHILE loop:
        do {
            if (min > arr[j]) {
                min = arr[j];
            }
            j++;
        } while (j < arr.length);
        System.out.println("Our minimum value is: " + min);
    }
}
