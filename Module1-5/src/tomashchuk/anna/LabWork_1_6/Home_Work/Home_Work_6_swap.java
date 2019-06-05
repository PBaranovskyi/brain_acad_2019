package tomashchuk.anna.LabWork_1_6.Home_Work;

import java.util.Arrays;

public class Home_Work_6_swap {
    public static void main(String[] args) {
        //swap - Менять местами значения 0 и 9 индекса
        int[] arr = new int[10];
        int a = 1;
        for (int i = 0; i < 10; i++) {
            arr[i] = a++;
        }
        int b = arr[0];
        arr[0] = arr[9];
        arr[9] = b;
        System.out.println(Arrays.toString(arr));
    }
}
