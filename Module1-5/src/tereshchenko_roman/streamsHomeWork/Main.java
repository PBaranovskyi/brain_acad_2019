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
//            employeeSet.addAll(companies.)
        }

        System.out.println(employeeList1.stream().map(p -> p.getAge()).collect(Collectors.toSet()));

    }


}
