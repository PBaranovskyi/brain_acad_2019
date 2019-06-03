package sinitsyn_ihor.HomeWorks;

import java.util.Arrays;

public class HomeWork11 {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("My array was: " + Arrays.toString(arr));
        int n = arr.length / 2;
        int temp;
        for (int i = 0; i < n; i++) {
            temp = arr[n + i];
            arr[n + i] = arr[i];
            arr[i] = temp;
        }
        System.out.println("My array now: " + Arrays.toString(arr));
    }
}