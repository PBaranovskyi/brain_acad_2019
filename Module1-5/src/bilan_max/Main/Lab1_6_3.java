package Main;

public class Lab1_6_3 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++){
        for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (i+1)+4*j;
            System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}