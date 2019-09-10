package sinitsyn_ihor.LabWorks.LabWorks2_14;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        MyTuple<String, Integer, Long> first = new MyTuple<>(rand.toString(), rand.nextInt(), rand.nextLong());
        MyTuple<Double, String, String> second = new MyTuple<>(rand.nextDouble(), rand.toString(), rand.toString());

        Integer[] arrInt = new Integer[rand.nextInt(5) + 5];
        Double[] arrD = new Double[rand.nextInt(5) + 5];
        Integer[] firstArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] secondArr = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = rand.nextInt(100);
        }
        for (int i = 0; i < arrD.length; i++) {
            arrD[i] = (double) Math.round(rand.nextDouble() * 1000.0)/100;
        }
        Integer maxElemInt = rand.nextInt(100);
        Double maxElemD = (double) Math.round(rand.nextDouble() * 1000.0)/100;
        System.out.println("Your Integer array: " + Arrays.toString(arrInt) + " it has " + arrInt.length + " elements.");
        System.out.println("Your maxElemInt = " + maxElemInt + ", number of elements grater than maxElem: " + MyTestMethod.calcNum(arrInt, maxElemInt));
        System.out.println("Sum of elements greater tnan " + maxElemInt + " are: " + (long) MyTestMethod.calcSum(arrInt, maxElemInt));
        System.out.println("Your Double array: " + Arrays.toString(arrD) + " it has " + arrD.length + " elements.");
        System.out.println("Your maxElemD = " + maxElemD + ", number of elements grater than maxElem: " + MyTestMethod.calcNum(arrD, maxElemD));
        System.out.println("Sum of elements greater tnan " + maxElemD + " are: " + MyTestMethod.calcSum(arrD, maxElemD));
        MyMixer firstMix = new MyMixer(firstArr);
        System.out.println("Int array before mixing: " + Arrays.toString(firstArr));
        firstMix.shuffle();
        System.out.println("Int array after mixing: " + Arrays.toString(firstArr));
        System.out.println("String array before mixing: " + Arrays.toString(secondArr));
        MyMixer secondMix = new MyMixer(secondArr);
        secondMix.shuffle();
        System.out.println("String array after mixing: " + Arrays.toString(secondArr));
    }
}
