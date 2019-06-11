package tereshchenko_roman.arrays.arrays_Add_Home_Works;

import java.util.Arrays;

public class Add_Home_Work_9 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int a = 10;
        for (int i = 0; i < 10; i++) {
            arr[i] = a;
            a--;
        }
        System.out.println(Arrays.toString(arr));

        int l = 10; //arr length
        int t; // buffer
        for (int i = 0; i < l / 2; i++) {
            t = arr[l - i - 1];
            arr[l - i - 1] = arr[i];
            arr[i] = t;
        }
        System.out.println(Arrays.toString(arr));
    }
}