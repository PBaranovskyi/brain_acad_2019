package Sinitsyn;

import java.util.Scanner;
public class Laba1_4_8 {
    public static void main(String[] args) {
        Scanner newS = new Scanner(System.in);
        System.out.println("Введите любое число в пределах int: ");
        int x = newS.nextInt();
        long a = (long) x;
        float b = (float) x;
        double c = (double) x;
        char d = (char) x;
        short e = (short) x;
        byte f = (byte) x;
        System.out.println("Вы ввели число "+x);
        System.out.println("При преобразовании в тип byte ваше число будет выглядеть так: "+f);
        System.out.println("При преобразовании в тип short ваше число будет выглядеть так: "+e);
        System.out.println("При преобразовании в тип long ваше число будет выглядеть так: "+a);
        System.out.println("При преобразовании в тип float ваше число будет выглядеть так: "+b);
        System.out.println("При преобразовании в тип double ваше число будет выглядеть так: "+c);
        System.out.println("При преобразовании в тип char ваше число будет выглядеть так: "+d);

    }
}
