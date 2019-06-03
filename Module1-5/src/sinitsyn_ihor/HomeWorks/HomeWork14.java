package sinitsyn_ihor.HomeWorks;

import java.util.Arrays;

public class HomeWork14 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("My array was: " + Arrays.toString(arr));
        int temp = 0;
        int i = 0;
//        With WHILE loop:
//        while (i < arr.length/2){
//            temp = arr[i+i];
//            arr[i+i]=arr[i+i+1];
//            arr[i+i+1]=temp;
//            i++;
//        }
//        With DO-WHILE loop:
        do {
            temp = arr[i + i];
            arr[i + i] = arr[i + i + 1];
            arr[i + i + 1] = temp;
            i++;
        } while (i < arr.length / 2);
        System.out.println("My array now: " + Arrays.toString(arr));
    }
}
