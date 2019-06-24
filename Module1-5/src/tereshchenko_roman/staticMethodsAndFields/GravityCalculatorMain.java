package tereshchenko_roman.staticMethodsAndFields;

import java.util.Scanner;

public class GravityCalculatorMain {
    public static void main(String[] args) {

        System.out.println("Введите время падения объекта (сек.):");
        Scanner scan = new Scanner(System.in);
        double time = scan.nextDouble();
        System.out.println("За это время объект пролетел " + GravityCalculator.calcDist(time) + " метров.");

    }
}
