package Tomashchuk_Anna.LabWork_2_5_Initialization_sections.Lab254;

import java.util.Arrays;

public class MyInit {
    private static int[] arr1;
    private static int[] arr2;

    static {
        // non-static initialization block
        arr1 = new int[10]; //Size of array is 10
        for (int i = 0; i < arr1.length; i++) {
            //  arr[i] = a++;
            arr1[i] = (int) (100 * Math.random());
        }
    }

    static {
        // non-static initialization block
        arr2 = new int[10]; //Size of array is 10
        for (int i = 0; i < arr2.length; i++) {
            //  arr[i] = a++;
            arr2[i] = (int) (100 * Math.random());
        }
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }

}
