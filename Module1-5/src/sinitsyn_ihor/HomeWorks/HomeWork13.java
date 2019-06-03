package sinitsyn_ihor.HomeWorks;

import java.util.Arrays;

public class HomeWork13 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("My array was: " + Arrays.toString(arr));
        int temp = 0;
        for (int i = 0; i < arr.length; i += 2) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println("My array now: " + Arrays.toString(arr));
    }
}
