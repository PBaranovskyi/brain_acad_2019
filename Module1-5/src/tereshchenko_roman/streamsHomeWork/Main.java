package tereshchenko_roman.streamsHomeWork;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList1 = Arrays.asList(new Employee("Anna", 25), new Employee("B", 50), new Employee("C", 50));
        List<Employee> employeeList2 = Arrays.asList(new Employee("D", 25), new Employee("E", 50), new Employee("F", 50));
        List<Employee> employeeList3 = Arrays.asList(new Employee("G", 25), new Employee("H", 50), new Employee("I", 50));

        Company company1 = new Company(employeeList1);
        Company company2 = new Company(employeeList2);
        Company company3 = new Company(employeeList3);

        List<Company> companies = Arrays.asList(company1, company2, company3);

        Set<Employee> employeeSet = new HashSet<>();

        for (Company company : companies) {
            employeeSet.addAll(company.getEmployeeList());
        }

        Map<Integer, List<String>> employeesMap = new HashMap<>();

        Set<Integer> employeesAge = employeeSet.stream()
                .map(employee -> employee.getAge())
                .collect(Collectors.toSet());

        for (Integer eachAge : employeesAge) {
            employeesMap.put(eachAge, new ArrayList<>());
        }

        for (Employee employee : employeeSet) {
            employeesMap.get(employee.getAge()).add(employee.getName());
        }

        System.out.println(employeesMap);

//        System.out.println(employeeSet.stream().map(p -> p.getAge()).collect(Collectors.toList()));

        Map<Integer, Set<String>> employeesMap2 = companies.stream()
                .flatMap(company -> company.getEmployeeList().stream())
                .collect(Collectors.groupingBy(Employee::getAge, Collectors.mapping(Employee::getName, Collectors.toSet())));

        System.out.println(employeesMap2);

        Map<Integer, Long> employeesMap3 = companies.stream()
                .flatMap(company -> company.getEmployeeList().stream())
                .collect(Collectors.groupingBy(Employee::getAge, Collectors.counting()));

        System.out.println(employeesMap3);
    }


}
