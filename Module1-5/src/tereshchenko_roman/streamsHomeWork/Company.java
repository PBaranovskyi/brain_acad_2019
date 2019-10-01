package tereshchenko_roman.streamsHomeWork;

import java.util.List;

public class Company {
    private List<Employee> employeeList;
    public Company(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}

