package Tomashchuk_Anna.LabWork_2_5_Initialization_sections.Static_initializ_block;

import java.util.Arrays;

public class Static3_Array {
    private static int[] arr;  //char[] alph

    static {
        arr = new int[10];
       // int i = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100 * Math.random());
        }
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr));
    }

}
