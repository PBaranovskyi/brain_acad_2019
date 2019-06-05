package sinitsyn_ihor.HomeWorks;

import java.util.Arrays;
import java.util.Random;

public class HomeWork19 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int sum = 0;
        Random myRand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = myRand.nextInt(100);
            sum += arr[i];
        }
        System.out.println("Our array: " + Arrays.toString(arr));
        System.out.println("Sum: " + sum);
    }
}
