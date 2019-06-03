package sinitsyn_ihor.HomeWorks;

import java.util.Arrays;

public class HomeWork6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("My array now is :" + Arrays.toString(arr));
        int temp = arr[0];
        arr[0] = arr[9];
        arr[9] = temp;
        System.out.println("My array after swapping :" + Arrays.toString(arr));
    }
}
