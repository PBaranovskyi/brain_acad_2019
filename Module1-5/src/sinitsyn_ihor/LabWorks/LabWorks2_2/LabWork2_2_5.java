package sinitsyn_ihor.LabWorks.LabWorks2_2;

import java.util.Scanner;

public class LabWork2_2_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину стороны фигуры: ");
        A side1 = new A();
        side1.test(scan.nextInt());
        side1.test();
    }

}
