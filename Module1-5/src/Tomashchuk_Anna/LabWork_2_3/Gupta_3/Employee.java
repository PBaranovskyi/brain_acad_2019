package Tomashchuk_Anna.LabWork_2_3.Gupta_3;

public class Employee {
    String name;
    int age;
    Employee() { // No-argument constructor
        this(null, 0); // Invokes constructor that accepts two method arguments
    }
    Employee(String newName, int newAge) { // Constructor that accepts two method arguments
        name = newName;
        age = newAge;
    }
}
