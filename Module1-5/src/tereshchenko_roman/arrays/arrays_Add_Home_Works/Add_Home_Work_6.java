package tereshchenko_roman.arrays.arrays_Add_Home_Works;

import java.util.Arrays;

public class Add_Home_Work_6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        arr = new int[10];
        System.out.println(Arrays.toString(arr));
        int a = 1;
        for (int i = 0; i<10; i++ ) {
            arr[i] = a++;
        }
        System.out.println(Arrays.toString(arr));
        int b = arr[0];
        arr[0]=arr[9];
        arr[9]=b;
        System.out.println(Arrays.toString(arr));
    }
}
