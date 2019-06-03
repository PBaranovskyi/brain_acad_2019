package sinitsyn_ihor.HomeWorks;

public class HomeWork22 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int a = 1;
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                arr[i][j] = a++;
                System.out.printf("%02d ", arr[i][j]);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
