package sinitsyn_ihor.HomeWorks;

import java.util.Random;
import java.util.Arrays;

public class HomeWork24 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random myRand = new Random();
        for (int a = 0; a < arr.length; a++) {
            arr[a] = myRand.nextInt(100);
        }
        System.out.println("Array was: " + Arrays.toString(arr));
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array now: " + Arrays.toString(arr));
    }
}
