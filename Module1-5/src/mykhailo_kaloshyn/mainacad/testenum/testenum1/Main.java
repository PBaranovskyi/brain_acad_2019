package mykhailo_kaloshyn.mainacad.testenum.testenum1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for (MyDayOfWeek day : MyDayOfWeek.values()) {

            //System.out.println(day);

            daysOfJavaClass(day);

        }

        System.out.println();
        System.out.println("Please, enter the weekday below:");
        Scanner sc = new Scanner(System.in);
        String inputDay = sc.nextLine().toUpperCase();
        MyDayOfWeek enumInputDay = MyDayOfWeek.valueOf(inputDay);
        System.out.println("The next day of week is: " + enumInputDay.nextDay().name());
        System.out.println(MyDayOfWeek.TUESDAY.nextDay());

    }

    public static void daysOfJavaClass(MyDayOfWeek day) {
        switch (day) {
            case TUESDAY:
            case FRIDAY:
                System.out.println("My java class is on: " + day.name());
                break;
            case MONDAY:
            case WEDNESDAY:
            case THURSDAY:
            case SATURDAY:
            case SUNDAY:
                break;
        }
    }
}
