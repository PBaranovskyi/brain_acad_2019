package mykhailo_kaloshyn.mainacad.lab2_2.myPersonell;

public class MyEmployee {

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


    public static void calcSum(MyEmployee emp) {

        double sumOfSalaries = 0;
        for (double x : emp.varargs_salary) {
            sumOfSalaries += x;
        }

        System.out.println("Employee " + emp.name + " earned in total: " + sumOfSalaries);
    }

}
