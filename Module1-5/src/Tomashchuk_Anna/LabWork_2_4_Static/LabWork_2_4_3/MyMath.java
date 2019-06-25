package Tomashchuk_Anna.LabWork_2_4_Static.LabWork_2_4_3;

public class MyMath {

    private static int minValue;
    private static int maxValue;
    public static final double PI = 3.14;
    private double r;
    private double area;


    public static int findMin(int... arr) {

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

    //which will take radius, use constant PI and calculate area.
    public static double areaOfCircle(double r) {
        double area;
        area = Math.pow(r, 2) * PI;
        return area;

    }


}
