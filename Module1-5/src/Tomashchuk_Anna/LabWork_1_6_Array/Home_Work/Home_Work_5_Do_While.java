package LabWork_1_6.Home_Work;

import java.util.Arrays;

public class Home_Work_5_Do_While {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int a = 30;
        int i = 0;

        do {
            arr[i] = a--;
            i++;
        }
        while (i < arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
