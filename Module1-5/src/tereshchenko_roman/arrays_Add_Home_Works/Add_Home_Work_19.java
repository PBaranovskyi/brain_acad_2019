package com.brainacad.arrays.arrays_Add_Home_Works;

import java.util.Arrays;
import java.util.Random;

public class Add_Home_Work_19 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Random rand = new Random();
        for (int a = 0; a < 10; a++) {
            arr[a] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int i = 0; i < 10; i++){
            sum = sum + arr[i];
        }
        System.out.println("Сумма знечений - " + sum);
}}
