package bykov;

import java.util.Random;

public class RandomArray {

    public static void main(String[] args) {
        int[][] a = new int[10][10];
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rnd.nextInt(100) + 1;
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
//        for (int i = 0; i < a.length; i++, System.out.println()) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.printf("%4d", a[i][j]);
//            }
//        }
    }
}