package mykhailo_kaloshyn.mainacad.lab2_2.myPersonell;

public class MyAccountant {

    public static void main(String[] args) {

        MyEmployee emp1 = new MyEmployee();
        emp1.setName("Petrov");
        double[] arr1 = {1.1, 1.2, 1.3};
        emp1.setVarargs_salary(arr1);

        MyEmployee.calcSum(emp1);

    }
}
