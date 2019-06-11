package tereshchenko_roman.arrays.arrays_Add_Home_Works;

import java.util.Arrays;

public class Add_Home_Work_7 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (i + 1);
        }
        System.out.println(Arrays.toString(arr));

        int a = arr[0];
        int b = 9;

        for (int m = 0; m < 2; m++) {
            arr[m] = arr[b];
            arr[b] = a;
            b--;
            a++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
