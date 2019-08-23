package Tomashchuk_Anna.LabWork_2_11_Exceptions_Assertions.lab_2_11_3;

public class Person {
    private String firstName,
            lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }

    //Setter in class Person which will modify age (setAge(int ))
    // should throw InvalidAgeException when age out of range 1-120.
    public void setAge(int age) {
        if (age > 120 || age < 0)
            throw new InvalidAgeException();
        this.age = age;
    }
}
