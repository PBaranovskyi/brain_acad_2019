package mainclasses.classwork20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Employee first = new Employee("Vasya Pupkin", 68);
        Employee second = new Employee("Tanya Galka", 23);
        Employee third = new Employee("Petr Greg", 23);

        List<Employee> employeeList = Arrays.asList(first, second, third);

        Company firstCompany = new Company("Apple", employeeList);

        Employee first2 = new Employee("Misha Gagarin", 12);
        Employee second2 = new Employee("Tanya Galka", 23);
        Employee third2 = new Employee("Milena Alanovskaya", 74);

        List<Employee> employeeList2 = Arrays.asList(first2, second2, third2);

        Company secondCompany = new Company("BMV", employeeList2);

        Employee first3 = new Employee("Boris Caska", 74);
        Employee second3 = new Employee("Vova Pikl ", 7);
        Employee third3 = new Employee("Nata Greg", 35);

        List<Employee> employeeList3 = Arrays.asList(first3, second3, third3);

        Company thirdCompany = new Company("Microsoft", employeeList3);



        List<Company> companyList = Arrays.asList(firstCompany, secondCompany, thirdCompany);

        Set<Employee> employeeSet = new HashSet<>();

        for (Company company : companyList) {

            employeeSet.addAll(company.getEmployeeList());
        }

        Map<Integer, List<String>> result = new HashMap<>();

        Set<Integer> ages = employeeSet.stream().map(empl -> empl.getAge()).collect(Collectors.toSet());

        System.out.println(ages);

        for (Integer age : ages) {
            result.put(age, new ArrayList<>());
        }

        for (Employee employee : employeeSet) {
            result.get(employee.getAge()).add(employee.getName());
        }

        System.out.println(result);

    }
}
