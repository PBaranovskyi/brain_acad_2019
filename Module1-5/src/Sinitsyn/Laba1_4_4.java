package Sinitsyn;

import java.util.Scanner;
public class Laba1_4_4 {
    public static void main(String[] args) {
        System.out.println("Введите любое целое число в пределах int: ");
        Scanner numb = new Scanner(System.in);
        int A = numb.nextInt();
        System.out.println("Ваше число обозначим как А, A="+A);
        int A1 = A++;
        System.out.println("Пост-инкремент от вашего числа А++="+ A1+". Он сначала использует число, затем увеличит его на +1");
        A--;
        int A2 = ++A;
        System.out.println("Пре-инкремент вашего числа ++А="+ A2+". Он сначала увеличит число на +1, затем использует его.");
        --A;
        int A3 = A--;
        System.out.println("Пост-декремент вашего числа А--="+ A3+". Он сначала использует число, затем уменьшит его на -1");
        A++;
        int A4 = --A;
        System.out.println("Пре-декремент вашего числа --А="+ A4+". Он сначала уменьшит число на -1, затем использует его.");
        ++A;
    }
}
