package LabWork_1_6.Home_Work;

import java.util.Arrays;

public class Home_Work_3_While {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int a = 1;
        int i = 0;
        while (i < arr.length) {
            arr[i] = a++;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
