package tereshchenko_roman.generics.testGenerics2;

public class MyTestMethod<T extends Number> {

    public static <T extends Comparable <T>>int calcNum(T[] a, T maxElem) {

        int t = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i].compareTo(maxElem) == 1)
                t++;
        return t;
    }

    public static <T extends Number & Comparable<T>> double calcSum(T[] arr, T maxVal) {

        double sum = 0.0;

        for (T t : arr)
            if (t.compareTo(maxVal) == 1)
                sum += t.doubleValue();
        return sum;
    }

}
