package tereshchenko_roman.arrays.arrays_Add_Home_Works;

import java.util.Arrays;
import java.util.Random;

public class Add_Home_Work_25 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Random rand = new Random();
        for (int a = 0; a < 10; a++) {
            arr[a] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));

        //sort by insertion sort algorithm
        for (int i = 1; i < 10; i++){
            int newEl = arr[i];
            int l = i-1;
            while (l>=0 && arr[l] > newEl){
                arr[l+1] = arr[l];
                l--;
            }
            arr[l+1]=newEl;
        }
        System.out.println(Arrays.toString(arr));
    }
}
