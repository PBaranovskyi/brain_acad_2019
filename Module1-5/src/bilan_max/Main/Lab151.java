package Main;

public class Lab151 {
    public static void main(String[] args) {
        int x = 0;
        int y;
        while (x < 8) {
            x++;
            y = x;
            while (y > 1) {
                System.out.print(y);
                y--;
            }
            System.out.println("1");
        }
    }
}