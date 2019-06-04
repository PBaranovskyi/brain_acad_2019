package mykhailo_kaloshyn.mainacad.lab1_6;

import java.util.Arrays;
import java.util.Scanner;

public class Lab1_6_4 {
    public static void main(String[] args) {
        int[] myArr = {11, 5, 18, 22, 35, 62, 43, 27, 5, 10, 9};
        System.out.println("Please, enter the requested number to be found in the array: ");
        Scanner requestedElement = new Scanner(System.in);
        int element = requestedElement.nextInt();
        Arrays.sort(myArr);
        System.out.println(Arrays.toString(myArr));
        int retVal = Arrays.binarySearch(myArr, element);
        System.out.println("An index of the requested element in the sorted array is: " + retVal);
    }
}
