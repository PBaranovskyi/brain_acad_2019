package tomashchuk.anna.LabWork_1_6;

public class LabWork_1_6_3_Variant_2 {
    public static void main(String[] args) {
        int t, i;
        int array[][] = new int[4][4];

        for (t = 0; t < array.length; ++t) {
            for (i = 0; i < array[t].length; ++i) {
                array[t][i] = (t * 4) + i + 1;
                System.out.print(array[t][i] + " ");
            }
            System.out.println();
        }
    }
}
