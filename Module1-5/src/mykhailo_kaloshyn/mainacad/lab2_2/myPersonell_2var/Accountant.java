package mykhailo_kaloshyn.mainacad.lab2_2.myPersonell_2var;

public class Accountant {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setName("Petrov Ivan");
        double[] arr1 = {1.1, 1.2, 1.3};
        emp1.setVarargs_salary(arr1);

        Employee.calcSum(emp1.getName(), emp1.getVarargs_salary());
    }
}
