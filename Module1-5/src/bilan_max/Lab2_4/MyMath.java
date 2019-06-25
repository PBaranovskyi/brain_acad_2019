package bilan_max.Lab2_4;

public class MyMath {
    public static int findMaxValue(int[] numbers) {

        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public static int findMinValue(int[] numbers) {
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }

    public static final double PI = 3.14;
    static double radius = 50.00;

    public static double areaOfCircle() {
        return (PI * radius * radius);
    }
}
