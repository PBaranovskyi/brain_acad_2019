package com.brainacad.arrays.arrays_Add_Home_Works;

import java.util.Arrays;

public class Add_Home_Work_3 {
    public static void main(String[] args) {
        int[] myArr = new int[10];
        int a = 0;
        while (a<10) {
            myArr[a] = (a+1);
            a++;
        }
        System.out.println(Arrays.toString(myArr));
    }
}
