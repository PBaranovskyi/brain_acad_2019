package Sinitsyn;

import java.util.Scanner;
public class Laba1_4_5 {
    public static void main(String[] args) {
        System.out.println("Введите любое целое число в пределах int: ");
        Scanner numb = new Scanner(System.in);
        int A = numb.nextInt();
        System.out.println("Ваше число обозначим как А, A="+A);
        int A1=A<<2;
        System.out.println("Применив оператор смещения влево мы получим A << 2 = "+ A1);
        int A2=A>>2;
        System.out.println("Применив оператор смещения вправо мы получим A >> 2 = "+ A2);
        int A3=A>>>2;
        System.out.println("Применив оператор смещения вправо без знака мы получим A >>> 2 = "+ A3);
    }
}
