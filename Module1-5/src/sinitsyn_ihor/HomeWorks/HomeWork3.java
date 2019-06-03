package sinitsyn_ihor.HomeWorks;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i = 0;
        while (i < arr.length) {
            arr[i] = i + 1;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
