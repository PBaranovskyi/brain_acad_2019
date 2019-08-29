package tereshchenko_roman.generics.testGenerics3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] strArr = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        MyMixer<Integer> myMixerInt = new MyMixer<>(intArr);
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(myMixerInt.shuffle()));
        System.out.println();

        MyMixer<String> myMixerStr = new MyMixer<>(strArr);
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(myMixerStr.shuffle()));
    }
}
