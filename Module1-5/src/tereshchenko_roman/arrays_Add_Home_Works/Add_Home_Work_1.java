package com.brainacad.arrays.arrays_Add_Home_Works;

import java.util.Arrays;

public class Add_Home_Work_1 {
    public static void main(String[] args) {
        int[] newArr = new int [5];
        for (int i = 0; i<5; i++) {
            newArr[i] = i+1;
        }
        System.out.println(Arrays.toString(newArr));
        int a = newArr[0];
        int b = newArr[3];
        newArr[0] = b;
        newArr[3] = a;
        System.out.println(Arrays.toString(newArr));
        int c = newArr[2];
        int d = newArr[4];
        newArr[2] = d;
        newArr[4] = c;
        System.out.println(Arrays.toString(newArr));
    }
}
