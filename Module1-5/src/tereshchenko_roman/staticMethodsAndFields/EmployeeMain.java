package tereshchenko_roman.staticMethodsAndFields;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan", "Ivanov", "employed", "223-22-11");
        Employee employee2 = new Employee("Petr", "Petrov", "unemployed", "223-22-22");
        Employee employee3 = new Employee("Sidor", "Sidorov", "student", "223-22-33");

        System.out.println(Employee.getNumberOfEmployees());
    }
}
