package mykhailo_kaloshyn.mainacad.lab2_2.myPersonell_2var;

public class Employee {

    private String name;
    private double[] varargs_salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getVarargs_salary() {
        return varargs_salary;
    }

    public void setVarargs_salary(double[] varargs_salary) {
        this.varargs_salary = varargs_salary;
    }


    public static void calcSum(String name, double... varargs_salary) {

        double sumOfSalaries = 0;
        for (double x : varargs_salary) {
            sumOfSalaries += x;
        }
        System.out.println("Employee " + name + " earned in total: " + sumOfSalaries);
    }
}
