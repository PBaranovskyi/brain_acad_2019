package sinitsyn_ihor.LabWorks1_4;

import java.util.Scanner;

public class Laba1_4_2 {
    public static void main(String[] args) {
        System.out.println("Введите по очереди два любых числа от 1 до 100 включительно: ");
        Scanner scan = new Scanner(System.in);
        int numA = scan.nextInt();
        if (numA >= 1 && numA <= 100) {
            int numB = scan.nextInt();
            if (numB >= 1 && numB <= 100) {
                int abS = numA + numB;
                int abM = numA - numB;
                double abD = (double) numA / (double) numB;
                int abU = numA * numB;
                int abP = numA % numB;
                System.out.println("Сумма ваших чисел = " + abS);
                System.out.println("Разность ваших чисел = " + abM);
                System.out.println("Частное ваших чисел = " + abD);
                System.out.println("Произведение ваших чисел = " + abU);
                System.out.println("Неделимый остаток ваших чисел = " + abP);
            } else {
                System.out.println("Я же попросил - в диапазоне ОТ 1 ДО 100! Попробуй еще раз...");
            }
        } else {
            System.out.println("Я же попросил - в диапазоне ОТ 1 ДО 100! Попробуй еще раз...");
        }
    }


}
