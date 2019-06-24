package Tomashchuk_Anna.LabWork_2_3.Gupta_1;

public class Employee {
    void Employee() {
        System.out.println("not a Constructor now");
    }
}
class Office {
    public static void main(String args[]) {
        Employee emp = new Employee();
        emp.Employee();
    }
}
