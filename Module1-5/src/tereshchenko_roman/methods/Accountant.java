package tereshchenko_roman.methods;

public class Accountant {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Ivanov";
        System.out.println(employee1.name);
        System.out.println(employee1.calcSalary ("Ivanov", 505.32, 206.48, 359.56));
    }
}
