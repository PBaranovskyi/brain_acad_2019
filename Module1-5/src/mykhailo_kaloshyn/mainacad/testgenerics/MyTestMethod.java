package mykhailo_kaloshyn.mainacad.testgenerics;

import java.util.Arrays;

public class MyTestMethod {

    public static <T extends Number & Comparable> void calcNum(T[] arr, T maxElem) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(maxElem) > 0) {
                count++;
            }
        }

        System.out.println(Arrays.toString(arr) + "\nNumber of elements that are greater than " + maxElem + ":"
                + "\n" + count + "\n");

    }


    public static <T extends Number & Comparable<T>> void calcSum(T[] arr, T maxElem) {

        double sumOfElements = 0.0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(maxElem) > 0) {
                sumOfElements += arr[i].doubleValue();
            }
        }

        System.out.println(Arrays.toString(arr) + "\nSumm of elements that are greater than " + maxElem + ":"
                + "\n" + sumOfElements + "\n");

    }
}
