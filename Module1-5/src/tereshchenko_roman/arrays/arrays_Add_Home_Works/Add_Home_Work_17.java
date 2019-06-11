package tereshchenko_roman.arrays.arrays_Add_Home_Works;

import java.util.Arrays;
import java.util.Random;

public class Add_Home_Work_17 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Random rand = new Random();
        for (int a = 0; a < 10; a++) {
            arr[a] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));

        int max = arr[0];

        for (int i = 0; i < 10; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное значение - " + max);
    }
}
