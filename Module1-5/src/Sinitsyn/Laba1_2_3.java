package Sinitsyn;

import java.util.Scanner;
public class Laba1_2_3 {
    public static void main(String[] args) {
        int catNum;
        String catName;
        do {
            Scanner scaner = new Scanner(System.in);
            System.out.println("Введите любимое имя или кличку: ");
            catName = scaner.nextLine();
            System.out.println("Теперь введите любое число от 0 до 10 включительно: ");
            catNum = scaner.nextInt();
        }
        while (catNum <= 10 && catNum >= 0 && !catName.isEmpty());{
            if (catNum == 0){
                System.out.println("У вас нет кота, но если бы он был - его бы звали " + catName + "!");
            }
            else if (catNum ==1){
                System.out.println("У вас один кот и его зовут " + catName + "!");
            }
            else if (catNum>1 && catNum<5){
                System.out.println("У вас " + catNum + " кота, одного из них зовут " + catName + "!");
            }
            else if (catNum>4 && catNum<=10){
                System.out.println("У вас " + catNum + " котов, одного из них зовут " + catName + "!");
            }
            else {
                System.out.println("Я сказал ОТ 0 и ДО 10 включительно! Попробуй еще раз.");
            }
        }
    }
}
