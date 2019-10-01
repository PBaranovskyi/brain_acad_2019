package mainclasses.classwork20;

import java.util.List;

public class Company {
    private final String company;
    private final List<Employee> employeeList;

    public Company(String company, List<Employee> employeeList) {
        this.company = company;
        this.employeeList = employeeList;
    }

    public String getCompany() {
        return company;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
