package bilan_max.Lab2_2;

public class Employee {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calcSalary(double... values) {
        double sumOfSalary = 0;
        for (double x : values) {
            sumOfSalary += x;
        }
        return sumOfSalary;
    }
}
