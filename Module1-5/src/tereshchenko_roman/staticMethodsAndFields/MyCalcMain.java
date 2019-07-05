package tereshchenko_roman.staticMethodsAndFields;


import java.util.Scanner;

public class MyCalcMain {


    public static void main(String[] args) {


        System.out.println("Введите параметр N - уровень точности вычисления числа π - от 0 до 999999999.");
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();


        System.out.print("Число π на этом уровне точности вычисления равно ");
        System.out.print(MyCalc.calcPi(n));
        System.out.print(".");
        //        System.out.printf("%.7f", myCalc.calcPi(n));

    }
}
