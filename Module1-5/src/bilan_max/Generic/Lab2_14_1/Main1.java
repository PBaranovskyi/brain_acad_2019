package bilan_max.Generic.Lab2_14_1;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {

        Integer[] array_1 = new Integer[15];
        for (int i=0; i<array_1.length; i++)
            array_1[i] = (int)(Math.random() * 100);
        System.out.println("Array values: " +
                Arrays.toString(array_1));

        Double[] array_2 = new Double[10];
        for (int i=0; i<array_2.length; i++)
            array_2[i] = Math.random() * 100;
        System.out.println("Array values: " +
                Arrays.toString(array_2));

        // lab 2_14_2
        System.out.println("Number of elements that are greater than 55: " +
                MyTestMethod.calcNum(array_1, 55));
        System.out.println("Number of elements that are greater than 67.8: " +
                MyTestMethod.calcNum(array_2, 67.8));

        // Lab 2_14_3
        System.out.println("-----------------------------------------------");
        System.out.println("Sum of elements that are greater than 75: " +
                (long)MyTestMethod.calcSum(array_1, 75));
        System.out.println("Sum of elements that are greater than 75: " +
                MyTestMethod.calcSum(array_2, 75.0));
    }
}
