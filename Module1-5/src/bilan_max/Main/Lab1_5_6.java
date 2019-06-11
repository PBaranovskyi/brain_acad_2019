package Main;
import java.util.Scanner;
public class Lab1_5_6 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter your number");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int sumofSquares=0;
            sumofSquares =(n*n)*2;
            System.out.println("The sum of squares of digits of number "  + sumofSquares);
        }
    }
}
