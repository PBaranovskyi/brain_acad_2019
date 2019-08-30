package mykhailo_kaloshyn.mainacad.testgenerics;

import java.util.Arrays;

import static mykhailo_kaloshyn.mainacad.testgenerics.MyTestMethod.calcNum;
import static mykhailo_kaloshyn.mainacad.testgenerics.MyTestMethod.calcSum;

public class Main {

    public static void main(String[] args) {

        MyTuple<String, Integer, Long> obj1 = new MyTuple<>("someString", 15, 10500L);
        MyTuple<Double, String, String> obj2 = new MyTuple<>(15.0505, "some1", "some2");

        Integer[] arrOfInteger = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] arrOfString = new String[]{"one", "two", "three", "four", "five", "six", "seven",
                "eight", "nine"};

        MyMixer<Integer> myMixerWithInteger = new MyMixer<>(arrOfInteger);
        MyMixer<String> myMixerWithString = new MyMixer<>(arrOfString);

        System.out.println(Arrays.toString(myMixerWithInteger.shuffle()));
        System.out.println(Arrays.toString(myMixerWithString.shuffle()));
        System.out.println("============================================");

        Integer[] arrOfInteger2 = new Integer[]{3, 11, 9, 2, 4, 23, 19, 14, 10, 7, 37, 32};
        Double[] arrOfDouble = new Double[]{3.1, 2.03, 1.9, 4.577, 4.26, 2.3, 1.95, 1.4, 1.0, 0.7, 3.7, 3.23};

        calcNum(arrOfInteger2, 5);
        calcNum(arrOfDouble, 2.4);

        calcSum(arrOfInteger2, 5);
        calcSum(arrOfDouble, 2.4);





    }
}
