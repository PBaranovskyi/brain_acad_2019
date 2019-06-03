package tomashchuk.anna.LabWork_1_6;

public class LabWork_1_6_6 {
    public static void main(String[] args) {
        int num[] = {-10, -7, 4, 8, 15, 27, 25, 16, 12, 9, 0, -5};
        int a, b, t;
        System.out.println("Average temperature values by months of 2015:");
        System.out.println(java.util.Arrays.toString(num));
        System.out.println();

        for (a = 1; a < num.length; a++) {
            for (b = num.length - 1; b > a; b--) {
                if (num[b - 1] > num[b]) {
                    t = num[b - 1];
                    num[b - 1] = num[b];
                    num[b] = t;
                }
            }
        }

        System.out.println("Sorted Array:");
        System.out.println(java.util.Arrays.toString(num));
    }
}
