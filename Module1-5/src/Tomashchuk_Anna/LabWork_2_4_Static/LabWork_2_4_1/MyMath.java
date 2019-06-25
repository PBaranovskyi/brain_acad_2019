package Tomashchuk_Anna.LabWork_2_4_Static.LabWork_2_4_1;

public class MyMath {

    private static int minValue;
    private static int maxValue;


    public static int findMin(int[] arr) {

        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }


    public static int findMax(int[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }

        return maxValue;
    }


}
