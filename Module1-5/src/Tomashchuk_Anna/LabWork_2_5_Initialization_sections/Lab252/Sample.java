package Tomashchuk_Anna.LabWork_2_5_Initialization_sections.Lab252;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            //  arr[i] = a++;
            arr[i] = (int) (100 * Math.random());
        }
        System.out.println(Arrays.toString(arr));
    }
}
