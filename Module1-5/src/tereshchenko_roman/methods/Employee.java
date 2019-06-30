package tereshchenko_roman.methods;

public class Employee {
    public String name;
    public double salary;
    public double calcSalary(String name, double ... salary){
        double sum = 0;
        for (int i = 0; i < salary.length ; i++)
        {
            sum = sum + salary[i];
        }
        return sum;
    }
}
