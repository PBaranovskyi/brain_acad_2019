package sinitsyn_ihor.LabWorks2_2;

import java.util.Scanner;

public class Employee {
    private String name;
    private double salary;
    private double sumOfSal;

    public void calcSal(String name){
        System.out.print("Введите количество месяцев, для суммирования зарплаты: ");
        Scanner scan = new Scanner(System.in);
        int date = scan.nextInt();
        this.sumOfSal = this.salary*date;
        System.out.println();
        System.out.println("Суммарная зарплата сотрудника " + this.name + " за период " + date + " месяцев составила: " + this.sumOfSal + " грн.");
    }

    public String getName() {
        return name;
    }

    public void setEmployee() {
        System.out.print("Введите фамилию работника: ");
        Scanner scan = new Scanner(System.in);
        this.name = scan.nextLine();
        System.out.println();
        System.out.print("Введите ставку месячного оклада: ");
        this.salary = scan.nextDouble();
        System.out.println();
    }

    public double getSalary() {
        return salary;
    }
}
