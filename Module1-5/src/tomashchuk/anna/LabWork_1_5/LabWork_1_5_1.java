package tomashchuk.anna.LabWork_1_5;

public class LabWork_1_5_1 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(i - j + " ");
            }
            System.out.println();
        }
    }
}
