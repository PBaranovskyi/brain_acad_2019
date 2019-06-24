package Tomashchuk_Anna.LabWork_2_3.Gupta_2;

public class Employee {
    {
        System.out.println("Employee:initializer 1");
    }
    Employee() {
        System.out.println("Employee:constructor");
    }
    {
        System.out.println("Employee:initializer 2");
    }
}
class TestEmp {
    public static void main(String args[]) {
        Employee e = new Employee();
    }
}
