package bilan_max.Generic.Lab2_14_1;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        Double[] arrDouble = {-4.5, 9.2, 5.1, -7.4, 2.2, 6.6, 8.3, -9.5};
        MyMixer<Double> mixer_1 = new MyMixer<>(arrDouble);
        System.out.println("Original array: " +
                Arrays.toString(arrDouble));
        System.out.println("Mixer array: " +
                Arrays.toString(mixer_1.shuffle()));

        String[] arrString = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        MyMixer<String> mixer_2 = new MyMixer<>(arrString);
        System.out.println("Original array: " +
                Arrays.toString(arrString));
        System.out.println("Mixer array: " +
                Arrays.toString(mixer_2.shuffle()));
    }
}
