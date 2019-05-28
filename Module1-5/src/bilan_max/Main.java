package bilan_max;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        while (x > 0) {
            System.out.println("Введите число от 1 до 3 и узнайте имя своего кота");
            Scanner k = new Scanner(System.in);
            int number1 = k.nextInt();
            String name1 = "Васька";
            String name2 = "Мурчик";
            String name3 = "Пушок";
            if (number1 == 1) {
                System.out.println("Имя вашего кота: " + name1);
            }
            if (number1 == 2) {
                System.out.println("Имя вашего кота:  " + name2);
            }
            if (number1 == 3) {
                System.out.println("Имя вашего кота:  " + name3);
            }
            if (number1 > 3) {
                System.out.println("Все-таки  "  +number1 +  "   не попадает в предложенные числа");
            }
            if (number1 == 0) {
                System.out.println("Вы что не любите котов?");
            }
        }
    }
}