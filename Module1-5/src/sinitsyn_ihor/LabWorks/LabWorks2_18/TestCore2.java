package sinitsyn_ihor.LabWorks.LabWorks2_18;

import java.util.Scanner;

public class TestCore2 {
    public static void main(String[] args) {
        int x;
        double y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, you have to decide what are you want: 0 - buy all types of nails, 1-9 - buy some nails of one type (from 0.1$ to 0.9$). Enter your number: ");
        int check = scan.nextInt();
        switch (check) {
            case (1):
                x = 10;
                y = count(0.1);
                toPrint(x, y);
                break;
            case (2):
                x = 5;
                y = count(0.2);
                toPrint(x, y);
                break;
            case (3):
                x = 3;
                y = count(0.3);
                toPrint(x, y);
                break;
            case (4):
                x = 2;
                y = count(0.4);
                toPrint(x, y);
                break;
            case (5):
                x = 2;
                y = count(0.5);
                toPrint(x, y);
                break;
            case (6):
                x = 1;
                y = count(0.6);
                toPrint(x, y);
                break;
            case (7):
                x = 1;
                y = count(0.7);
                toPrint(x, y);
                break;
            case (8):
                x = 1;
                y = count(0.8);
                toPrint(x, y);
                break;
            case (9):
                x = 1;
                y = count(0.9);
                toPrint(x, y);
                break;
            case (0):
                System.out.println("You can buy 4 different nails and will have 0.0 change.");
                break;
            default:
                System.out.println("Please, number from 0 to 9...");
        }
    }

    public static int toPrint(int value, double money){
        System.out.println("You can buy " +  value + " nail(s), and you will have " + money + " change.");
        return 0;
    }

    public static Double count(double price) {
        int quantity = (int) Math.floor(1 / price);
        return Math.round((1 - (price * quantity))*100.0)/100.0;
    }
}
