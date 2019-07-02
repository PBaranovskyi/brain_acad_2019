package Tomashchuk_Anna.LabWork_2_5_Initialization_sections.Lab255;

public class Main {
    public static void main(String[] args) {
        //create five instances of class InitTest and invokes method getId()
        // on each instance and print returned value on console

        InitTest initTest1 = new InitTest();
        InitTest initTest2 = new InitTest();
        InitTest initTest3 = new InitTest();
        InitTest initTest4 = new InitTest();
        InitTest initTest5 = new InitTest();

        System.out.println("initTest1_ID: " + initTest1.getId());
        System.out.println("initTest1_ID: " + initTest2.getId());
        System.out.println("initTest1_ID: " + initTest3.getId());
        System.out.println("initTest1_ID: " + initTest4.getId());
        System.out.println("initTest1_ID: " + initTest5.getId());
    }
}
