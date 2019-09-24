package mainclasses.classwork19;

public class UseFunctional {


    public static void main(String[] args) {

        System.out.println(calculatorOperation(5, 6, (a, b) -> a + b));
        System.out.println(calculatorOperation(5, 6, (a, b) -> a * b));
        System.out.println(calculatorOperation(5, 6, (a, b) -> a - b));

    }


    static int calculatorOperation(int a, int b, MyFuncInterface operation){
        return operation.calc(a, b);
    }
}
