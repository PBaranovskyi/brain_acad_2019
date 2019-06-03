package tomashchuk.anna.LabWork_1_6.Home_Work;

import java.util.Arrays;

public class Home_Work_2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int a = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
