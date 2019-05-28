package mykhailo_kaloshyn.mainacad.lab1_4;

public class Lab1_4_2 {
    public static void main(String[] args) {
        int a = 20, b = 7;
        int newSum = a + b;
        int newSubstract = a - b;
        int newMultiplying = a * b;
        int newDeviding = a / b;
        int newRest = a % b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a + " + " + b + " = " + newSum);
        System.out.println(a + " - " + b + " = " + newSubstract);
        System.out.println(a + " * " + b + " = " + newMultiplying);
        System.out.println(a + " / " + b + " = " + newDeviding);
        System.out.println(a + " % " + b + " = " + newRest);
    }
}

