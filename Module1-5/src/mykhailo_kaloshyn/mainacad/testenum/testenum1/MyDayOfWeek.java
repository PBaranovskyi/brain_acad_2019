package mykhailo_kaloshyn.mainacad.testenum.testenum1;


public enum MyDayOfWeek {

    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public MyDayOfWeek nextDay () {
        MyDayOfWeek[] daysArr = MyDayOfWeek.values();
        int i = daysArr.length;
        if (this.ordinal()<i-1) {
            return daysArr[this.ordinal() + 1];
        } else {
            return daysArr[0];
        }
    }

}
