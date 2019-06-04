public class Lab1_6_3 {
    public static void main(String[] args) {
        int arr[][] = {{1, 5, 9, 13}, {2, 6, 10, 14}, {3, 7, 11, 15}, {4, 8, 12, 16}};
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                System.out.print(arr[a][b] + "  ");
            }
            System.out.println();
        }
    }
}
