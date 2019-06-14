package mainclasses;

import java.util.Arrays;

public class Referals {

    public static void main(String[] args) {
        int x = 1;
        int x2 = changeValue(x);
        System.out.println(x);
        System.out.println(x2);

        ////////////////


        int[] arr = {1, 2, 3, 4, 5};
        chageArray(arr);
        System.out.println(Arrays.toString(arr));

        //////


    }

    private static void chageArray(int[] list) {
        list[1] = 123;
    }

    private static int changeValue(int t) {
        t = 123;
        t++;
        return t;
    }

}
