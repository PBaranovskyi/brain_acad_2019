package mykhailo_kaloshyn.mainacad.lab1_6;

public class Lab1_6_2 {
    public static void main(String[] args) {
        int[] m = {10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int maxValue = m[0];
        int minValue = m[0];
        double sumOfValues = m[0];
        for (int i = 1; i <= m.length - 1; i++) {
            sumOfValues += m[i];
            if (m[i] > maxValue) {
                maxValue = m[i];
            }
            if (m[i] < minValue) {
                minValue = m[i];
            }
        }
        System.out.println("Max value of array: " + maxValue);
        System.out.println("Min value of array: " + minValue);
        System.out.println("The average is: " + sumOfValues / m.length);
    }
}
