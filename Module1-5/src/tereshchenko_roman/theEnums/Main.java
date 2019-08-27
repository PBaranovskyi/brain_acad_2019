package tereshchenko_roman.theEnums;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyDayOfWeek[] myDayOfWeeks = MyDayOfWeek.values();
        for (MyDayOfWeek dayOfWeek : myDayOfWeeks) {
            System.out.println(dayOfWeek);
        }

        System.out.println();

        for (MyDayOfWeek dayOfWeek : myDayOfWeeks) {
            switch (dayOfWeek) {
                case TUESDAY:
                case FRIDAY:
                    System.out.println("My Java day: " + dayOfWeek);
            }
        }

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String day = scanner.next();

        try {
            MyDayOfWeek dayOfWeek = MyDayOfWeek.valueOf(day.toUpperCase());
            System.out.println("The next day of week: " + dayOfWeek.nextDay());
        } catch (IllegalArgumentException exp) {
            System.out.println("The name of the day of the week is not correct");
        }

    }
}