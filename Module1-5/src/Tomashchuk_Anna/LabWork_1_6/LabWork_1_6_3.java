package LabWork_1_6;

public class LabWork_1_6_3 {
    public static void main(String args[]) {
        int array[][] = new int[4][4];
        int i, j, k = 1;

        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = k;
                k++;
            }
        }

        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.printf("%4d", array[j][i]);
            }

            System.out.println();
        }
    }
}
