package sinitsyn_ihor.HomeWorks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("My array: " + Arrays.toString(arr));
        int temp = arr[0];
        arr[0] = arr[3];
        arr[3] = temp;
        temp = arr[2];
        arr[2] = arr[4];
        arr[4] = temp;
        System.out.println("My array after changes: " + Arrays.toString(arr));
    }
}
