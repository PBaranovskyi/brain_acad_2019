package sinitsyn_ihor.HomeWorks;

public class HomeWork23 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int x = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = x++;
                System.out.printf("%02d ",  arr[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        for (int a = 4; a >= 0; a--) {
            for (int b = 4; b >= 0; b--) {
                System.out.printf("%02d ", arr[a][b]);
            }
            System.out.println();
        }
    }
}
