package sinitsyn_ihor;

public class Laba1_6_3 {
    public static void main(String[] args) {
        int[][] arrayOfArrays = new int[4][4];
        int numFirstArray, numSecondArray, coef = 0;
        for (int iterative = 0; iterative < arrayOfArrays.length; iterative++) {
            numFirstArray = iterative;
            for (int iterativeTwo = 0; iterativeTwo < arrayOfArrays.length; iterativeTwo++) {
                numSecondArray = iterativeTwo;
                coef++;
                arrayOfArrays[numFirstArray][numSecondArray] = coef;
            }
        }
        for (int masterArray = 0; masterArray < arrayOfArrays.length; masterArray++) {
            for (int slaveArray = 0; slaveArray < arrayOfArrays.length; slaveArray++) {
                System.out.print(arrayOfArrays[slaveArray][masterArray] + " ");
            }
            System.out.println();
        }
    }
}
