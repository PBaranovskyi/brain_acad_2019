package tereshchenko_roman.coreJavaClasses;

import java.util.Calendar;
import java.util.Date;

public class MyDateAndTime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        Calendar calend = Calendar.getInstance();
        System.out.println(calend);
        System.out.println();
        System.out.println(calend.getTime());
        System.out.println(calend.getWeekYear());
        System.out.println(calend.getTimeInMillis());
    }
}
