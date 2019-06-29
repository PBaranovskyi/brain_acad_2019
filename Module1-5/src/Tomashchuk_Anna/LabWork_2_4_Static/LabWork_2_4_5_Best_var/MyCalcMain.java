package Tomashchuk_Anna.LabWork_2_4_Static.LabWork_2_4_5_Best_var;

import java.util.Scanner;

public class MyCalcMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество шагов для определения числа Пи: ");
        int numb = scan.nextInt();
        MyCalc.calcPi(numb);
        System.out.println("Итоговое число Пи с количеством шагов " + numb + " равно: " + MyCalc.getPi());
    }

}
