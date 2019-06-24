package Tomashchuk_Anna.LabWork_2_3.Gupta_4;

public class Employee {
    String name;
    int age;
    Employee() {
        age = 22;
    }
    public void setName(String val) {
        name = val;
    }
    public void printEmp() {
        System.out.println("name = " + name + " age = " + age);
    }
}
