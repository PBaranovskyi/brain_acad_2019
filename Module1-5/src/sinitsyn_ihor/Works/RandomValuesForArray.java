package sinitsyn_ihor.Works;


import java.util.Random;

public class RandomValuesForArray {
    public static void main(String[] args) {
        int[][] testArray = new int[10][10];
        for (int i = 0; i < testArray.length; i++) {
            for (int j = 0; j < testArray.length; j++) {
                Random myRand = new Random();
                int newValue = myRand.nextInt(100);
                testArray[i][j] = newValue;
                System.out.printf("%02d ", testArray[i][j]);
            }
            System.out.println();
        }

    }
}
