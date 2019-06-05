package sinitsyn_ihor.LabWorks1_3;

import java.util.Scanner;
class Laba1_2_1 {
    public static void main(String[] args) {
//        int catAge;
//        String catName;
//        do {
//            Scanner scaner = new Scanner(System.in);
//            String catName = scaner.nextLine();
//            System.out.println("Введите любимое имя или кличку: ");
//            catName = scaner.nextLine();
//            System.out.println("Теперь введите любое число от 0 до 10 включительно: ");
//            catAge = scaner.nextInt();
//        } while (catAge <= 10 && catAge >= 0 && !catName.isEmpty());
//    }

        System.out.println("Введите любимое имя или кличку: ");
        Scanner scanName = new Scanner(System.in);
        String catName = scanName.nextLine();
        System.out.println("Теперь введите любое число от 0 до 10 включительно: ");
        Scanner scanCount = new Scanner(System.in);
        int catNum = scanCount.nextInt();
        if (catNum >= 0 && catNum <= 10) {
            if (catNum == 0) {
                System.out.println("У вас нет кота, но если бы он был - его бы звали " + catName + "!");
            } else if (catNum == 1) {
                System.out.println("У вас один кот и его зовут " + catName + "!");
            } else if (catNum > 1 && catNum < 5) {
                System.out.println("У вас " + catNum + " кота, одного из них зовут " + catName + "!");
            } else {
                System.out.println("У вас " + catNum + " котов, одного из них зовут " + catName + "!");
            }
        } else {
            System.out.println("Я сказал ОТ 0 и ДО 10 включительно! Попробуй еще раз.");
        }
    }
}