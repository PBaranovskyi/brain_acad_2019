package com.brainacad.arrays.arrays_Add_Home_Works;

import java.util.Arrays;

public class Add_Home_Work_12 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int a = 10;
        for (int i = 0; i < 10; i++) {
            arr[i] = a;
            a--;
        }
        System.out.println(Arrays.toString(arr));

        int t;
        int i = 0;

        while (i < 5) {
            t = arr[i];
            arr[i] = arr[i + 5];
            arr[i + 5] = t;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
