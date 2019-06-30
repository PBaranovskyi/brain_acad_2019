package Tomashchuk_Anna.LabWork_2_5_Initialization_sections.Lab252;

import java.util.Arrays;

public class MyInit2 {
    int[] arr = new int[10];

    {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (100 * Math.random());
    }

    public void printArray() {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        MyInit myInit1 = new MyInit();
        MyInit myInit2 = new MyInit();

        myInit1.printArray();
        myInit2.printArray();
    }
}
