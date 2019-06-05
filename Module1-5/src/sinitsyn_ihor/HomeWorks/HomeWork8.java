package sinitsyn_ihor.HomeWorks;

import java.util.Arrays;

public class HomeWork8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int a = 9;
        int i = 0;
        // With WHILE loop:
//        while (i < 2) {
//            int temp = arr[i];
//            arr[i] = arr[a];
//            arr[a] = temp;
//            a--;
//            i++;
//        }
        //With DO-WHILE loop:
        do {
            int temp = arr[i];
            arr[i] = arr[a];
            arr[a] = temp;
            a--;
            i++;
        } while (i < 2);
        System.out.println(Arrays.toString(arr));
    }
}
