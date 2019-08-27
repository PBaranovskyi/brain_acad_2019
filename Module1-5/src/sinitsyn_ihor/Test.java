package sinitsyn_ihor;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("Enter month (in English with big letter first, please: ");
        Scanner scan = new Scanner(System.in);
        String myMonth = scan.nextLine();
        Test.checkMonth(myMonth);
    }

    static int checkMonth(String month) {
        int days = 0;
        if (month == "February") {
            days = 28;
            System.out.println(days + " days in this month.");
        } else if (month == "January" | month == "March" | month == "May" | month == "July" | month == "August" | month == "October" | month == "December"){
            days = 31;
            System.out.println(days + " days in this month.");
        } else {
            days = 30;
            System.out.println(days + " days in this month.");
        }
        return days;
    }
}
