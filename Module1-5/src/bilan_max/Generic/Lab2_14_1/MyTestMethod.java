package bilan_max.Generic.Lab2_14_1;

public class MyTestMethod {
    // lab 2_14_2
    public static <T extends Comparable> int calcNum(T[] array, T maxelm) {
        int count = 0;
        for (T element : array)
            if (element.compareTo(maxelm) > 0)
                count++;
        return count;
    }

    // lab 2_14_3
    public static <T extends Number & Comparable> double calcSum(T[] array, T maxval) {
        double sum = 0.0;
        for (T element : array)
            if (element.compareTo(maxval) > 0)
                sum += element.doubleValue();
        return sum;
    }
}
