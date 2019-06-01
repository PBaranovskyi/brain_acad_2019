package sinitsyn_ihor.LabWorks1_4;

import java.util.Scanner;
public class Laba1_4_6 {
    public static void main(String[] args) {
        System.out.println("Введите два значения переменных в диапазоне int:");
        Scanner newScan = new Scanner(System.in);
        int a = newScan.nextInt();
        int b = newScan.nextInt();
                System.out.println("Вы ввели два числа, "+a+" и "+b);
                System.out.println("Результат для оператора AND : "+ (a & b));
                System.out.println("Результат для оператора OR : "+ (a | b));
                System.out.println("Результат для оператора XOR : "+ (a ^ b));
                System.out.println("Результат оператора NOT для первого числа : "+ (~a));
                System.out.println("Результат оператора NOT для второго числа : "+ (~b));
    }
}