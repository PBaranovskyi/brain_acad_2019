package sinitsyn_ihor.LabWorks1_5;

public class Laba1_5_3 {
    public static void main(String[] args) {
        System.out.println(" * | 1 2 3 4 5 6 7 8 9");
        System.out.println("______________________________");
        for (int i = 1; i < 10; i++) {
            System.out.print(" " + i + " |");
            for (int j = 1; j < 10; j++) {
                int x = (j * i);
                System.out.print(" " + x);
            }
            System.out.println();
        }
    }
}
