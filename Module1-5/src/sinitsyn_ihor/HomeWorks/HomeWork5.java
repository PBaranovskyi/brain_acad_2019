package sinitsyn_ihor.HomeWorks;

import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int a = 30;
        int i = 0;
        do {
            arr[i] = a--;
            i++;
        } while (i < arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
