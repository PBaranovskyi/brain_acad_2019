package LabWork_1_6;

public class LabWork_1_6_2 {
    public static void main(String[] args) {
        int[] array = {10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int n = array.length;
        int min = array[0];
        int max = array[0];
        int result = 0;
        int avg = 0;

        for (int i = 0; i < n; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
            result = result + array[i];
            avg = result / array.length;
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Sum: " + result);
        System.out.println("Avg: " + avg);
    }
}
