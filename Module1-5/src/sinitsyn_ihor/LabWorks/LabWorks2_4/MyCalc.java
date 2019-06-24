package sinitsyn_ihor.LabWorks.LabWorks2_4;

import java.util.Scanner;

public class MyCalc {
    private static double divider = 3;
    private static double pi = 4;

    public static double calcPi(int number) {
        for (int i = 0; i < number; i++) {
            double addict = 4 / divider;
            if (i%2==0) {
                pi -= addict;
            } else {
                pi += addict;
            }
            divider += 2;
//            System.out.println("Pi = " + pi + " addict = " + addict + " divider = " + divider);
        }
        return pi;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество шагов для определения числа Пи: ");
        int numb = scan.nextInt();
        MyCalc.calcPi(numb);
        System.out.println("Итоговое число Пи с количеством шагов " + numb + " равно: " + MyCalc.getPi());
    }

    public static double getPi() {
        return pi;
    }
}
