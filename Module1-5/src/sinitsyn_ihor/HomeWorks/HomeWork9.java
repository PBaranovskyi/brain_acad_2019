package sinitsyn_ihor.HomeWorks;

import java.util.Arrays;

public class HomeWork9 {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        System.out.println("My array now: " + Arrays.toString(arr));
//        for (int i = arr.length-1; i > 0; i--){
//            for (int j = 0; j < i; j++){
//                if (arr[j] > arr[i]){
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
        int n = arr.length;
        for (int i = 0; i < n/2; i++){
            int temp = arr[n - i - 1];
            arr [n-i-1] = arr[i];
            arr[i] = temp;
        }
        System.out.println("My array after swapping: " + Arrays.toString(arr));
    }
}
