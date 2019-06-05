package sinitsyn_ihor.HomeWorks;

import java.util.Arrays;
import java.util.Random;

public class HomeWork15 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random myRand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int x = myRand.nextInt(100);
            arr[i] = x;
        }
        System.out.println("My array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("The smallest element: " + arr[0]);
//        Other variant:
//        int min = arr[0];
//        for (int j = 0; j < arr.length; j++){
//            if (min > arr[j]){
//                min = arr[j];
//            }
//        }
//        System.out.println("The smallest element: " + min);
    }
}
