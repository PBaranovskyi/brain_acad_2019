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
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = rand.nextInt(100);
        }
        for (int i = 0; i < arrD.length; i++) {
            arrD[i] = rand.nextDouble() * 100.0;
        }
        Integer maxElemInt = rand.nextInt(100);
        Double maxElemD = rand.nextDouble() * 100.0;
        System.out.println("Your Integer array: " + Arrays.toString(arrInt) + " it has " + arrInt.length + " elements.");
        System.out.println("Your maxElemInt = " + maxElemInt + ", number of elements grater than maxElem: " + MyTestMethod.calcNum(arrInt, maxElemInt));
        System.out.println("Your Double array: " + Arrays.toString(arrD) + " it has " + arrD.length + " elements.");
        System.out.println("Your maxElemD = " + maxElemD + ", number of elements grater than maxElem: " + MyTestMethod.calcNum(arrD, maxElemD));
    }
}
