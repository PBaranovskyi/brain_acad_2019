package sinitsyn_ihor.HomeWorks;

import java.util.Arrays;
import java.util.Random;

public class HomeWork25 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random myRand = new Random();
        for (int a = 0; a < arr.length; a++) {
            arr[a] = myRand.nextInt(100);
        }
        System.out.println("Array was: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int b = i - 1;
            while (b >= 0 && arr[b] > a) {
                arr[i] = arr[i - 1];
                arr[b + 1] = arr[b];
                b--;
            }
            arr[b + 1] = a;
        }
        System.out.println("Array now: " + Arrays.toString(arr));
    }
}
