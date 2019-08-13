package mainclasses;

import tereshchenko_roman.inheritanceAndPolymorphism.MyShapes.com.brainacad.oop.testshapes.Rectangle;

public class Arrays {

    public static void main(String[] args) {

        int[] arr = new int[5];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = i*i;
        }

//        for (int i = 0; i < arr.length; i++) {
//            int element = arr[i];
//            System.out.println(element);
//        }
//
//        for (int element : arr) {
//            System.out.print(element);
//        }

        int[] arr1 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }; // new larger array
        int[] arr2 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        System.out.println("Equals : " + (arr1.equals(arr2)));
        System.out.println("Equals : " + java.util.Arrays.equals(arr1,arr2));
// copy all of the arr1 array to the hold
// arr2, starting with the 0th index
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);


        for (int element : arr2) {
            System.out.print(" " + element);
        }

    }

    public static void toString(int[] arr) {
    }

    }
