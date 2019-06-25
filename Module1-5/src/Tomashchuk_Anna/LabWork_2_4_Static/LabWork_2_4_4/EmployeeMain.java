package Tomashchuk_Anna.LabWork_2_4_Static.LabWork_2_4_4;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Anna", "Tomashchuk", "Billing system admin", 504406800);
        Employee employee2 = new Employee("Artem", "Zaliznyak", "Programmer", 635507600);
        Employee employee3 = new Employee("Tanya", "Kalosha", "QA", 0503302040);
        System.out.println(Employee.getNumberOfEmployees());
    }
}
