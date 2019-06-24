package sinitsyn_ihor.LabWorks.LabWorks2_4;

import java.util.Scanner;

public class LabWork2_4_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество сотрудников на фирме: ");
        int number = scan.nextInt();
        Employee worker = new Employee();
        worker.setEmployees(number);
    }
}
