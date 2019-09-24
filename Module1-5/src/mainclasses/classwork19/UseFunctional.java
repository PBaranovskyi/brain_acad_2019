package mainclasses.classwork19;

import java.util.function.BiFunction;

public class UseFunctional {


    public static void main(String[] args) {

        System.out.println(calculatorOperation(5, 6, (a, b) -> a + b));
        System.out.println(calculatorOperation(5, 6, (a, b) -> a * b));
        System.out.println(calculatorOperation(5, 6, (a, b) -> a - b));


        System.out.println(calculatorOperation(5, 6, UseFunctional::getPlusOperation));
        System.out.println(calculatorOperation(2, 1, UseFunctional::getMultiplyOperation));
        System.out.println(calculatorOperation(5, 6, UseFunctional::getMinusOperation));
        System.out.println(calculatorOperation(10, 6, UseFunctional::getMinusOperation));
        System.out.println(calculatorOperation(55, 61, UseFunctional::getMinusOperation));
        System.out.println(calculatorOperation(53, 64, UseFunctional::getMinusOperation));
        System.out.println(calculatorOperation(5, 6, new PowOperation()));
        System.out.println(calculatorOperation(5, 6, (a, b) -> (int) Math.pow(a, b)));
    }


    static int calculatorOperation(int a, int b, CalcOperation operation){
        System.out.println("Calc name: " + operation.getCalculatorName(a, b));
        return operation.calc(a, b);
    }


    static Integer calculatorOperation2(int a, int b, BiFunction<Integer, Integer, Integer> operation){
        return operation.apply(a, b);
    }


    static int getPlusOperation(int a, int b){
        System.out.println("a= " + a + " b=" + b) ;
        return  a + b ;
    }

    static int getMinusOperation(int a, int b){
        System.out.println("a= " + a + " b=" + b) ;
        return  a - b ;
    }

    static int getMultiplyOperation(int a, int b){
        System.out.println("a= " + a + " b=" + b) ;
        return  a * b ;
    }
}
