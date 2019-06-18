package bilan_max.Lab2_1.Lab2_2;

public class Accountant {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setName("Василий Алибабаевич");
        double sum1=emp1.calcSalary(6789.78,5678.67);
        System.out.println(emp1.getName());
        System.out.println(sum1);
    }
}

