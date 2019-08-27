package tereshchenko_roman.theEnums;

public enum MyDayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;


    public MyDayOfWeek nextDay() {
        MyDayOfWeek[] arrDay = MyDayOfWeek.values();
        int index = this.ordinal();
        if (index == arrDay.length - 1) {
            index = 0;
        } else {
            index++;
        }
        return arrDay[index];
    }
}
