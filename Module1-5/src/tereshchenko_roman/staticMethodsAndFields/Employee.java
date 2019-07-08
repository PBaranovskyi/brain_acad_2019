package tereshchenko_roman.staticMethodsAndFields;

public class Employee {
    static int test;
    public String firstName;
    public String lastName;
    public String occupation;
    public String telephone;

    static {
        System.out.println("static start Emploee: test " + test);
    }

    {
        System.out.println("start Emploee: test" + test);
        System.out.println("start Emploee: firstName" + firstName);
    }

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


