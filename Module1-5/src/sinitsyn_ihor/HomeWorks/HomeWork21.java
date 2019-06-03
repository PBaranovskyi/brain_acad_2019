package sinitsyn_ihor.HomeWorks;

public class HomeWork21 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int a = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = a++;
                System.out.printf("%02d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
