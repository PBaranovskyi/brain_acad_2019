package tereshchenko_roman.arrays.arrays_Add_Home_Works;

import java.util.Arrays;

public class Add_Home_Work_10 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int a = 10;
        for (int i = 0; i < 10; i++) {
            arr[i] = a;
            a--;
        }
        System.out.println(Arrays.toString(arr));

        int l = 10;
        int t;
        int i = 0;

        while (i < 5) {
            t = arr[l - i - 1];
            arr[l - i - 1] = arr[i];
            arr[i] = t;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
