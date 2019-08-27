package tereshchenko_roman.theEnums;

import java.util.Date;

public enum Month2 {

    January(31),
    February {
        public int getDaysCount() {
            return date.getYear() % 4 == 0 ? 29 : 28;
        }
    },
    March(31),
    April(30);

    int daysCount;

    Date date = new Date();

    Month2(){}

    Month2(int day) {
        daysCount = day;
    }

    public int getDaysCount() {
        return daysCount;
    }
}
