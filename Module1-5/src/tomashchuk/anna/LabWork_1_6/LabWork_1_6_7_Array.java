package tomashchuk.anna.LabWork_1_6;

public class LabWork_1_6_7_Array {
    public static void main(String args[]) {
        int arr[][] = {
                {1, 1, 1, 3, 4},
                {2, 1, 3, 1, 2},
                {2, 2, 3, 4, 1},
                {3, 3, 3, 1, 4}
        };
        int i, j;

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }

    }
}
