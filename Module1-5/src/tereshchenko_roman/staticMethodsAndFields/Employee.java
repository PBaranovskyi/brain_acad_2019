package tereshchenko_roman.staticMethodsAndFields;

public class Employee {
    public String firstName;
    public String lastName;
    public String occupation;
    public String telephone;

    private static int numberOfEmployees;

    public Employee(String firstName, String lastName, String occupation, String telephone) {
        numberOfEmployees++;
    }

//    public static void setNumberOfEmployees(int numberOfEmployees) {
//        Employee.numberOfEmployees = numberOfEmployees;
//    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}


