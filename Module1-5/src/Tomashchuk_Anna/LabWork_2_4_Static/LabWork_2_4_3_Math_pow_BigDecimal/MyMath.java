package Tomashchuk_Anna.LabWork_2_4_Static.LabWork_2_4_3_Math_pow_BigDecimal;

public class MyMath {

    private static int minValue;
    private static int maxValue;
    public static final double PI = 3.14;
    private double r;
    private double area;
    private double areaMath;


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

   //which will take radius, use constant PI and calculate area.
    public static double areaOfCircle(double r) {
        double area;
       area = r *r * PI;
       return area;

    }
// Второй способ нахождения площади круга - с использованием Math
    public static double areaOfCircleMath(double r) {
        double areaMath;
        areaMath = Math.pow(r,2.0)*PI; // 2 -это степень, это r в степени 2, тоесть r *r
        return areaMath;

    }


}
