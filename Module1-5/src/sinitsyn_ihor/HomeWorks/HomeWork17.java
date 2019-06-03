package sinitsyn_ihor.HomeWorks;

import java.util.Arrays;
import java.util.Random;

public class HomeWork17 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random myRand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = myRand.nextInt(100);
        }
        System.out.println("Our array: " + Arrays.toString(arr));
        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
            }
        }
        System.out.println("Maximum value: " + max);
    }
}
