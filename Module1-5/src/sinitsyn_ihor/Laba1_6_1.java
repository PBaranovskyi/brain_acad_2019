package sinitsyn_ihor;

public class Laba1_6_1 {
    public static void main(String[] args) {
        int[] myArray = new int[15];
        for (int iterative = 1; iterative <= 15; iterative++) {
            int num = iterative - 1;
            myArray[num] = iterative + iterative;
            System.out.println("array[" + num + "] = " + myArray[num]);
        }
    }
}
