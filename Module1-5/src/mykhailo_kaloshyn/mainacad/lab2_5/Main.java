package mykhailo_kaloshyn.mainacad.lab2_5;

import static com.mainacad.lab2_5.MyInit.printArray;

public class Main {
    public static void main(String[] args) {

        MyInitTest obj1 = new MyInitTest();
        System.out.println();

        MyInit objOfMyInit1 = new MyInit();
        MyInit objOfMYInit2 = new MyInit();

        printArray(objOfMyInit1);
        printArray(objOfMYInit2);
        System.out.println();

        InitTest objInitTest1 = new InitTest();
        InitTest objInitTest2 = new InitTest();
        InitTest objInitTest3 = new InitTest();
        InitTest objInitTest4 = new InitTest();
        InitTest objInitTest5 = new InitTest();

        System.out.println("ID of objInitTest1 is: " + objInitTest1.getId());
        System.out.println("ID of objInitTest2 is: " + objInitTest2.getId());
        System.out.println("ID of objInitTest3 is: " + objInitTest3.getId());
        System.out.println("ID of objInitTest4 is: " + objInitTest4.getId());
        System.out.println("ID of objInitTest5 is: " + objInitTest5.getId());

    }
}
