package tereshchenko_roman.staticMethodsAndFields;

import java.util.Scanner;

public class MyPyramidMain {
    public static void main(String[] args) {
        System.out.println("Введите высоту пирамиды:");
        Scanner scan = new Scanner(System.in);
        int h;
        h = scan.nextInt();
        MyPyramid.printPyramid(h);
    }
}
