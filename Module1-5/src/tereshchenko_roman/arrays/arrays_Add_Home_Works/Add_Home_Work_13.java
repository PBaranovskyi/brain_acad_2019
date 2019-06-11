package tereshchenko_roman.arrays.arrays_Add_Home_Works;

import java.util.Arrays;

public class Add_Home_Work_13 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (i + 1);
        }
        System.out.println(Arrays.toString(arr));

        int t; // buffer
        for (int i = 0; i < 5; i++) {
            t = arr[i+i];
            arr[i+i] = arr[i+i+1];
            arr[i+i+1] = t;
        }
        System.out.println(Arrays.toString(arr));
    }
}

