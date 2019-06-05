package sinitsyn_ihor.HomeWorks;

import java.util.Arrays;

public class HomeWork10 {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("My array before: " + Arrays.toString(arr));
        int i = 0;
        int n = arr.length;
        //With WHILE loop:
//        while (i < 5){
//            int temp = arr[n -i -1];
//            arr[n -i -1] = arr[i];
//            arr[i] = temp;
//            i++;
//        }
        //With DO-WHILE loop:
        do {
            int temp = arr[n - i - 1];
            arr[n - i - 1] = arr[i];
            arr[i] = temp;
            i++;
        } while (i < 5);
        System.out.println("My array after: " + Arrays.toString(arr));
    }
}
