package sinitsyn_ihor.HomeWorks;
import java.util.Arrays;
public class HomeWork12 {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        System.out.println("My array was: " + Arrays.toString(arr));
        int n = arr.length/2;
        int temp;
        int i = 0;
//        With WHILE loop:
//        while (i < n){
//            temp = arr[i];
//            arr[i] = arr[n + i];
//            arr [n + i] = temp;
//            i++;
//        }
//        With DO-WHILE loop:
        do {
            temp = arr[i];
            arr[i] = arr[n + i];
            arr [n + i] = temp;
            i++;
        } while (i < n);
        System.out.println("My array now: " + Arrays.toString(arr));
    }
}
