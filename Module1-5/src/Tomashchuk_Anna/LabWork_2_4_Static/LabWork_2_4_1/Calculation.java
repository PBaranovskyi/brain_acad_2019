package Tomashchuk_Anna.LabWork_2_4_Static.LabWork_2_4_1;

public class Calculation {
    public static void main(String[] args) {

        int[] emptyArr = {};

        int[] arr1 = {7, 18, 23, 42};
        int[] arr2 = {14, 67, 9, 83};

        System.out.println("Minimum value arr1: " + MyMath.findMin(arr1));
        System.out.println("Minimum value arr2: " + MyMath.findMin(arr2));
        System.out.println();

        System.out.println("Maximum value arr1: " + MyMath.findMax(arr1));
        System.out.println("Maximum value arr2: " + MyMath.findMax(arr2));

    }
}



