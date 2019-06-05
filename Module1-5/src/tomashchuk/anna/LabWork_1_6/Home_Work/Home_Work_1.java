package tomashchuk.anna.LabWork_1_6.Home_Work;

import java.util.Arrays;

public class Home_Work_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Origin Array:");
        System.out.println(Arrays.toString(array));
        System.out.println();
        int a = array[0];
        array[0] = array[3];
        array[3] = a;
        System.out.println("Change places of elements 0 and 3:");
        System.out.println(Arrays.toString(array));
        System.out.println();

        int b = array[2];
        array[2] = array[4];
        array[4] = b;
        System.out.println("Change places of elements 2 and 4:");
        System.out.println(Arrays.toString(array));
    }
}
