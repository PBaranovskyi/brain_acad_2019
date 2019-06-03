package sinitsyn_ihor.HomeWorks;

import java.util.Arrays;
import java.util.Random;

public class HomeWork20 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random myRand = new Random();
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            arr[i] = myRand.nextInt(100);
            sum += arr[i];
            i++;
        }
        System.out.println("Our array: " + Arrays.toString(arr));
        System.out.println("Sum: " + sum);
    }
}
