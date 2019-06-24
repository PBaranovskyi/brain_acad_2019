package Tomashchuk_Anna.LabWork_2_3.Gupta_6;

public class Employee {
    String name;
    int age;
    Employee() {
    }
    Employee(String newName, int newAge) {
        name = newName;
        age = newAge;
    }
    Employee(String newName, int newAge, boolean create) {
       // this();
        this(newName, newAge);
        if (create)
            System.out.println(10);
    }
}
