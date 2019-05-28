package sinitsyn_ihor;

import java.util.Scanner;
public class Laba1_5_5 {
    public static void main(String[] args) {
        int averageNumber = 0;
        int sumOfNumbers = 0;
        System.out.println("Программа считает сумму чисел от 0 до указанного Х и выдает сумму и среднее значение, Х может быть со знаком минус.");
        System.out.print("Введите значение Х : ");
        Scanner scanNumber = new Scanner(System.in);
        int x = scanNumber.nextInt();
        for(int i = 1; i<=Math.abs(x); i++) {
            sumOfNumbers = sumOfNumbers+i;
            averageNumber = sumOfNumbers/i;
        }
        System.out.println("Сумма всего диапазона чисел = "+sumOfNumbers);
        if (x<0) {
            System.out.println("Среднее значение диапазона = " + averageNumber*(-1));
        }
        else {
            System.out.println("Среднее значение диапазона = " + averageNumber);
        }
    }
}