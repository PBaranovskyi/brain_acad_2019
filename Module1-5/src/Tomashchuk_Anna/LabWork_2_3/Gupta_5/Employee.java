package Tomashchuk_Anna.LabWork_2_3.Gupta_5;

public class Employee {
    String name;
    int age;
    Employee() {
        this(null, 0);
        System.out.println("No-argument constructor");
        // this(null, 0); -- так нельзя писать - не скомпилится
    }
    Employee(String newName, int newAge) {
        name = newName;
        age = newAge;
    }
}
