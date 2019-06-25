package Tomashchuk_Anna.LabWork_2_3.Gupta_7;

public class Employee {
    private String name;

    public void setName(String val) {
        name = val;
    }

    public int daysOffWork(int... days) {
        int daysOff = 0;
        for (int i = 0; i < days.length; i++) {
            daysOff += days[i];
        }
            return daysOff;

    }
}