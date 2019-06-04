package mykhailo_kaloshyn.mainacad.lab1_6;

public class Lab1_6_3 {
    public static void main(String[] args) {
        int[][] marr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                marr[i][j] = (i + 1) + 4 * j;
                System.out.printf("%4d", marr[i][j]);
            }
            System.out.println();
        }
    }
}
