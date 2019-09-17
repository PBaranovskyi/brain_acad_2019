package sinitsyn_ihor.LabWorks.LabWorks2_18;

import java.util.Scanner;

public class TestCore2 {
    public static void main(String[] args) {
        int x;
        double y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, you have to decide what are you want: 0 - buy all types of nails, 1-9 - buy some nails of one type (from 0.1$ to 0.9$). Enter your number: ");
        int check = scan.nextInt();
        if (check == 0) {
            System.out.println("You bought 4 different nails (0,1$+0,2$+0,3$+0,4$) and money left over: 0.0$");
        } else if (check > 0 && check < 10) {
            x = countNails(check);
            y = countChange((double) check / 10);
            toPrint(x, y);
        } else {
            System.out.println("Please, number from 0 to 9...");
        }
    }
    TestCore2(int number){
        int x = countNails(number);
        double y = countChange((double) number / 10);
        toPrint(x, y);
    }

    public static void toPrint(int value, double money) {
        System.out.println(value + " nail(s) bought. Money left over: $" + money);
    }

    public static Double countChange(double price) {
        int quantity = (int) Math.floor(1 / price);
        return Math.round((1 - (price * quantity)) * 100.0) / 100.0;
    }

    public static Integer countNails(int numb) {
        return (int) Math.floor(10 / numb);
    }
}