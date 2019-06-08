package com.brainacad.arrays.arrays_Add_Home_Works;

import java.util.Arrays;

public class Add_Home_Work_8 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (i + 1);
        }
        System.out.println(Arrays.toString(arr));

        int a = arr[0];
        int b = 9;
        int j = 0;

        while (j < 2) {
            arr[j]  = arr[b];
            arr[b] = a;
            a++;
            b--;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
