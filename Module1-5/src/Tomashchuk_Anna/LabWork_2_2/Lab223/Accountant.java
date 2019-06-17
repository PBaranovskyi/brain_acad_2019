package LabWork_2_2.Lab223;

public class Accountant {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Alex";

        Employee employee2 = new Employee();
        employee2.name = "Diana";

        Employee employee3 = new Employee();
        employee3.name = "Olya";

        double sum1 = employee1.calcSalary(employee1.name, 3500.00);
        double sum2 = employee2.calcSalary(employee2.name, 2030.50, 2125.30);
        double sum3 = employee3.calcSalary(employee3.name, 1500.00, 1750.50, 1645.30);

        System.out.println(employee1.name + ": " + sum1);
        System.out.println(employee2.name + ": " + sum2);
        System.out.println(employee3.name + ": " + sum3);

    }
}
