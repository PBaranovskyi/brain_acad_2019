package tereshchenko_roman.theEnums;

import java.util.Date;

public enum Month {

    January(31), February(28), March(31), April(30);

    int daysCount;

    Date date = new Date();

    Month(int day) {
        daysCount = day;
    }

    public int getDaysCount() {
        if (this == February && date.getYear() % 4 == 3) {
            return 29;
        }
        return daysCount;
    }
}
