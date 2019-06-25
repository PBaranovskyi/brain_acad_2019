package bilan_max.Lab2_4;

public class MyEmployee {
    private static int numOfEmployees;
    private String firstName;
    private String lastName;
    private String occupation;
    private int phoneNumber;

    public MyEmployee() {
        numOfEmployees++;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName(){
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

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
}

