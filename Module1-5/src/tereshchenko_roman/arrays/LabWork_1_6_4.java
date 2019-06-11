package com.brainacad.arrays;

import java.util.Arrays;

public class LabWork_1_6_4 {
    public static void main(String[] args) {
        int[] myArray = {2, 5, 12, 13, 65, 38, 13, 29, 698};
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.binarySearch(myArray, 13));
    }
}
