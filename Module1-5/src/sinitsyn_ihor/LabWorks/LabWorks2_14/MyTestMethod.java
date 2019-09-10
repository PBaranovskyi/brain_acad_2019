package sinitsyn_ihor.LabWorks.LabWorks2_14;

public class MyTestMethod {
    public static <T extends Comparable> int calcNum(T[] arr, T maxElem) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(maxElem) > 0) {
                count++;
            }
        }
        return count;
    }

    public static <T extends Number & Comparable> double calcSum(T[] arr, T maxValue) {
        double result = 0.0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(maxValue) > 0) {
                result += arr[i].doubleValue();
            }
        }
        return result;
    }
}
