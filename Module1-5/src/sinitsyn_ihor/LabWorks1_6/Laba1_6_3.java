package sinitsyn_ihor.LabWorks1_6;

public class Laba1_6_3 {
    public static void main(String[] args) {
        int[][] arrayOfArrays = new int[4][4];
        int coef = 1;
        for (int j = 0; j < arrayOfArrays.length; j++) {
            for (int j2 = 0; j2 < arrayOfArrays.length; j2++) {
                arrayOfArrays[j][j2] = coef++;
            }
        }
        for (int i = 0; i < arrayOfArrays.length; i++) {
            for (int i2 = 0; i2 < arrayOfArrays.length; i2++) {
                    System.out.printf("%02d |", arrayOfArrays[i2][i]);
            }
            System.out.println();
        }
    }
}
