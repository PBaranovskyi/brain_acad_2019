package com.brainacad.arrays.arrays_Add_Home_Works;

import java.util.Arrays;

public class Add_Home_Work_5 {
    public static void main(String[] args) {
        int[] doArr = new int[10];
        int a = 30;
        int i = 0;
        do {
            doArr[i] = a;
            a--;
            i++;
        }
        while (i < 10);
        System.out.println(Arrays.toString(doArr));
    }
}
