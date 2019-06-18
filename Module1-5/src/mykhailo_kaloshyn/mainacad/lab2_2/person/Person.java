package mykhailo_kaloshyn.mainacad.lab2_2.person;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int phoneNumber;

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

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    static void personCreature(Person person, String firstName) {
        person.firstName = firstName;
    }

    static void personCreature(Person person, String firstName, String lastName) {
        person.firstName = firstName;
        person.lastName = lastName;
    }

    static void personCreature(Person person, String firstName, String lastName, int age) {
        person.firstName = firstName;
        person.lastName = lastName;
        person.age = age;
    }

    static void personCreature(Person person, String firstName, String lastName, int age, String gender) {
        person.firstName = firstName;
        person.lastName = lastName;
        person.age = age;
        person.gender = gender;
    }

    static void personCreature(Person person, String firstName, String lastName, int age, String gender, int phoneNumber) {
        person.firstName = firstName;
        person.lastName = lastName;
        person.age = age;
        person.gender = gender;
        person.phoneNumber = phoneNumber;
    }

}
