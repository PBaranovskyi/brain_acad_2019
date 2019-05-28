package Tereshchenko;

public class LabWork_1_5_3 {
    public static void main(String[] args) {
        System.out.println(" * | 1 2 3 4 5 6 7 8 9");
        System.out.println("----------------------");
        for (int i = 1; i < 10; i++) {
            System.out.print(" " + i + " " + "|" + " ");
            for (int n = 1; n<9; n++) {
                System.out.print( (i*n + " "));
            }
            System.out.println(i*9);
        }
    }
}
