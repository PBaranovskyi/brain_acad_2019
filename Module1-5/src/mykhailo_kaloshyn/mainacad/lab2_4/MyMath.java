package mykhailo_kaloshyn.mainacad.lab2_4;

public class MyMath {

    final static double PI = 3.14;

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static double areaOfCircle (double r) {
        double s = PI * r * r;
        return  s;
    }

}
