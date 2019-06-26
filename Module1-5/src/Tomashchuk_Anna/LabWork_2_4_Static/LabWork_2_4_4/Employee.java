package Tomashchuk_Anna.LabWork_2_4_Static.LabWork_2_4_4;

public class Employee {
    private String firstName;
    private String lastName;
    private String occupation;
    private int telephone;
    private static int numberOfEmployees; // numberOfEmployees - общий для всех

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getTelephone() {
        return telephone;
    }

    public Employee(String firstName, String lastName, String occupation, int telephone) {
        numberOfEmployees++;
    }
     // static method declaration
    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }


}



