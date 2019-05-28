package bykov;

public class Laba1_5_1 {

    public static void main(String[] args) {
        int b = 0;
        int c;
        while (b < 8) {
            b++;
            c = b;
            while (c > 0) {
                System.out.print(c);
                c--;
            }
            System.out.println();
        }
    }
}
