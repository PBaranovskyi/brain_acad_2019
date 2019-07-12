package Tomashchuk_Anna.LabWork_2_2_Methods.Lab223;

public class Employee {
    public String name;

    public double calcSalary(String name, double... salary) {
        double res = 0.00;
        for (double x : salary) {
            res += x;
        }
        return res;

    }
}
