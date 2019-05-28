package Sinitsyn;

import java.util.Scanner;
public class Laba1_4_7 {
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        System.out.println("У вас есть кот, это правда? false|true");
        boolean a = newScan.nextBoolean();
        int b = a?1:2;
        if (b<2){
            System.out.println("Я угадал!");
        }
        else{
            System.out.println("К сожалению, я не угадал...");
        }
    }
}
