package Tomashchuk_Anna.LabWork_2_3_Constructors.Calling_one_Constr_from_another_this;

public class Employee {
    String name;
    int age;
    Employee() {
        name = "John";
        age = 25;
    }
    Employee(String newName) {
        name = newName;
        age = 25;
    }
    Employee(int newAge, String newName) {
        name = newName;
        age = newAge;
    }
    Employee(String newName, int newAge) {
        name = newName;
        age = newAge;
    }
}
