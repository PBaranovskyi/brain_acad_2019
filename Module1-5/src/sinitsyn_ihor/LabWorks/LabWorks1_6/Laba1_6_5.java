package sinitsyn_ihor.LabWorks.LabWorks1_6;

import java.util.Arrays;

import static java.util.Arrays.fill;

public class Laba1_6_5 {
    public static void main(String[] args) {
        int[][] firstArray = new int [4][4];
        int[][] secondArray = new int[5][4];
        String secondM = Arrays.deepToString(secondArray);
        System.out.println("First matrix values: "+secondM);
          int firstIndex, secondIndex, coef = 0;
          for (int iterative = 0; iterative < firstArray.length; iterative++) {
            firstIndex = iterative;
            for (int iterativeTwo = 0; iterativeTwo < firstArray.length; iterativeTwo++) {
                secondIndex = iterativeTwo;
                coef++;
                firstArray[firstIndex][secondIndex]=coef;
            }
        }
        System.out.println("Second matrix values: " + Arrays.deepToString(firstArray));
        System.arraycopy(firstArray, 0, secondArray, 0, firstArray.length);
        System.out.println("First matrix values after transpose: " + Arrays.deepToString(secondArray));
    }
}
