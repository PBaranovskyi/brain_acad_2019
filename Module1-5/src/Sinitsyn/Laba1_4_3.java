package Sinitsyn;

import java.util.Scanner;
public class Laba1_4_3 {
    public static void main(String[] args) {
        System.out.println("Введите два значения для переменной boolean используя цифры 0 (false) или 1 (true) :");
        Scanner newScan = new Scanner(System.in);
        int numberA = newScan.nextInt();
        if (numberA >= 0 && numberA<= 1) {
            int numberB = newScan.nextInt();
            if (numberB >=0 && numberB<= 1){
                boolean a = true;
                boolean b = false;
                System.out.println("Если предположить что первое значение true, а второе false, то: ");
                System.out.println("Результат оператора AND : "+ (a & b));
                System.out.println("Результат оператора OR : "+ (a | b));
                System.out.println("Результат оператора XOR : "+ (a ^ b));
//                System.out.println("Результат оператора NOT для первого числа : "+ (~a));
//                System.out.println("Результат оператора NOT для второго числа : "+ (~b));
            }
            else {
                System.out.println("Я же попросил - или 0, или 1! Попробуй еще раз...");
            }
        }
        else {
            System.out.println("Я же попросил - или 0, или 1! Попробуй еще раз...");
        }
    }
}

