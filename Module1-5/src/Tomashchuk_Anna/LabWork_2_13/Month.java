package Tomashchuk_Anna.LabWork_2_13;

public class Month {
    public static int getMonthNumber(String month) {

        int monthNumber = 0;

        if (month == null) {
            return monthNumber;
        }

        switch (month.toLowerCase()) {
            case "january":
                monthNumber = 30;
                break;
            case "february":
                monthNumber = 28;
                break;
            case "march":
                monthNumber = 30;
                break;
            case "april":
                monthNumber = 30;
                break;
            case "may":
                monthNumber = 31;
                break;
            case "june":
                monthNumber = 30;
                break;
            case "july":
                monthNumber = 31;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default:
                monthNumber = 0;
                break;
        }

        return monthNumber;
    }

    public static void main(String[] args) {

        String month = "August";

        int returnedMonthNumber = Month.getMonthNumber(month);

        if (returnedMonthNumber == 0) {
            System.out.println("Invalid month");
        } else {
            System.out.println(returnedMonthNumber);
        }
    }
}
