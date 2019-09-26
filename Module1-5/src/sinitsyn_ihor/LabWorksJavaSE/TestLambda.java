package sinitsyn_ihor.LabWorksJavaSE;

import java.util.Arrays;
import java.util.Random;

public class TestLambda {
    public static void main(String[] args) {
        Random rand = new Random();
        Integer[] intArr = new Integer[10];
        String[] stringArr = {"Vasya", "Adolf", "Kolya", "Misha", "Vova", "Olya", "Agafon"};
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(100);
        }
        System.out.println("Int array before sorting: " + Arrays.toString(intArr));
        Arrays.sort(intArr, (i, j) -> j.compareTo(i));
        System.out.println("Int array after sorting: " + Arrays.toString(intArr));
        System.out.println("----------------------------------------");
        System.out.println("String array before sorting: " + Arrays.toString(stringArr));
        Arrays.sort(stringArr, (i, j) -> j.compareTo(i));
        System.out.println("String array after sorting: " + Arrays.toString(stringArr));
    }
}
