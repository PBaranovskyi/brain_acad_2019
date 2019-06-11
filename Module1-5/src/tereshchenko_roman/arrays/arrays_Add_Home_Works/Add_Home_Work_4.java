package tereshchenko_roman.arrays.arrays_Add_Home_Works;

import java.util.Arrays;

public class Add_Home_Work_4 {
    public static void main(String[] args) {
        int[] myArr = new int[10];
        int a = 30;
        for (int i = 0; i < 10; i++) {
            myArr[i] = a;
            a--;
        }
        System.out.println(Arrays.toString(myArr));
    }
}
