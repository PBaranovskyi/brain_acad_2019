package bilan_max.Lab2_4;

public class MyPyramid {
    public static void printPyramid(int h) {

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    for (int k = j; k > 0; k--) {
                        System.out.print( k);
                    }
                    System.out.println( );
                    continue;
                }
                System.out.print(j);
            }
        }
    }
}
