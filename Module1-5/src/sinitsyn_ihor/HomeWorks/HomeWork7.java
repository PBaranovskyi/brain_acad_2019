package sinitsyn_ihor.HomeWorks;

import java.util.Arrays;

public class HomeWork7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int a = 9;
        for (int i = 0; i < 2; i++) {
            int temp = arr[i];
            arr[i] = arr[a];
            arr[a] = temp;
            a--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
