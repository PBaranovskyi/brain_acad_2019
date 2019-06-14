package sinitsyn_ihor.LabWorks2_2;

import java.util.Arrays;

public class MainMethod {
    public static void main(String[] args) {
        Matrix myMatrix = new Matrix();
        int[][] arr1 = {{1,2,3,4,5}, {2,3,4,5,6}, {3,4,5,6,7}, {4,5,6,7,8}, {5,6,7,8,9}};
        int[][] arr2 = {{1,2,3,4,5}, {2,3,4,5,6}, {3,4,5,6,7}, {4,5,6,7,8}, {5,6,7,8,9}};
        int[][]arr3 = new int[5][5];
        myMatrix.setFirstArr(arr1);
        myMatrix.setSecondArr(arr2);
//        myMatrix.setMultiplicationOfArr(arr3);
        System.out.println(Arrays.toString(myMatrix.getMultiplicationOfArr()));
    }
}
