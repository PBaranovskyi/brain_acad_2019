package tereshchenko_roman.streamsHomeWork;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList1 = Arrays.asList(new Employee("Anna", 25), new Employee("B", 50), new Employee("C", 50));
        List<Employee> employeeList2 = Arrays.asList(new Employee("D", 25), new Employee("E", 50), new Employee("C", 50));
        List<Employee> employeeList3 = Arrays.asList(new Employee("F", 25), new Employee("G", 50), new Employee("C", 50));

        Company company1 = new Company(employeeList1);
        Company company2 = new Company(employeeList2);
        Company company3 = new Company(employeeList3);

        List<Company> companies = Arrays.asList(company1, company2, company3);

        Set<Employee> employeeSet = new HashSet<>();

        for (Company company : companies) {
            employeeSet.addAll(company.getEmployeeList());
        }

        Map<Integer, List<String>> employeesMap = new HashMap<>();

        Set<Integer> employeesAge = employeeSet.stream().map(employee -> employee.getAge()).collect(Collectors.toSet());

        for (Integer eachAge : employeesAge) {
            employeesMap.put(eachAge, new ArrayList<>());
        }

        for (Employee employee : employeeSet) {
            employeesMap.get(employee.getAge()).add(employee.getName());
        }

        System.out.println(employeesMap);

//        System.out.println(employeeSet.stream().map(p -> p.getAge()).collect(Collectors.toList()));

    }


}
