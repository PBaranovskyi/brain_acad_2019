package bilan_max.Lab2_4;

import  java.util.Scanner;
public class MyCalc {
    public static double calcPi (int n){
        double sequence = 0;
        for (int i=1; i<=n; i++){
            sequence +=  Math.pow(-1,i)* 4 / (i*2 + 1) ;
        }
        double pi = 4 + sequence ;
        return pi;
    }

    public static void main(String[] args) {
        System.out.println("Input a number  ");
        Scanner number1 = new Scanner(System.in);
        int n = number1.nextInt();
        System.out.println("Pi: " + calcPi(n));
    }
}
