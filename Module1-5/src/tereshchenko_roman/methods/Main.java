package tereshchenko_roman.methods;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] arr1 = {{1, 2, 3}, {2, 3, 4}, {3, 4, 6}};

        int[][] arr2 = {{2, 3, 4}, {3, 4, 5}, {5, 6, 7}};

        Matrix matrix = new Matrix();
        Matrix matrix2 = new Matrix();

        matrix.setInnitial(arr1);
        matrix2.setInnitial(arr2);

        int[][] sum = matrix.add(matrix2);

        int[][] sum2 = matrix2.add(matrix);


        System.out.println(Arrays.deepToString(sum));
        System.out.println(Arrays.deepToString(sum2));



        System.out.println(5);
    }
}
