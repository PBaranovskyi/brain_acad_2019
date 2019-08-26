package bilan_max.Enum;

public class Testenum1 {
    enum MyDayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    ;

    public static void main(String[] args) {
        for (MyDayOfWeek days : MyDayOfWeek.values()) {
            System.out.println(days);
        }
        System.out.println();
        MyDayOfWeek dayOfWeek=MyDayOfWeek.TUESDAY;
        switch (dayOfWeek){
            case TUESDAY:
                System.out.println("My Java day: TUESDAY");
            case THURSDAY:
                System.out.println("My Java day: THURSDAY");
            case SATURDAY:
                System.out.println("My Java day: SATURDAY");
        }
    }
}
