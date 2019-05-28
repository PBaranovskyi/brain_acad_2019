package sinitsyn_ihor;

import java.util.Scanner;
class Laba1_2_2 {
    public static void main(String[] args) {
        System.out.println("Введите любимое имя или кличку: ");
        Scanner scanName = new Scanner(System.in);
        String catName = scanName.nextLine();
        System.out.println("Теперь введите любое число от 0 до 10 включительно: ");
        Scanner scanCount = new Scanner(System.in);
        int catNum = scanCount.nextInt();
        switch(catNum){
            case 0:
                System.out.println("У вас нет кота, но если бы он был - его бы звали " + catName + "!");
                break;
            case 1:
                System.out.println("У вас один кот и его зовут " + catName + "!");
            break;
            case 2:case 3:case 4:
                System.out.println("У вас " + catNum + " кота, одного из них зовут " + catName + "!");
                break;
            case 5:case 6:case 7:case 8:case 9:case 10:
                System.out.println("У вас " + catNum + " котов, одного из них зовут " + catName + "!");
                break;
            default:
                System.out.println("Я сказал ОТ 0 и ДО 10 включительно! Попробуй еще раз.");
                break;
        }
        }
    }