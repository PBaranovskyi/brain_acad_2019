package Tomashchuk_Anna.LabWork_2_11_Exceptions_Assertions.lab_2_11_2;

public class Main {
    public static void main(String[] args) {
        // lab 2_11_2
        try {
            throw new MyException("Testing");
        } catch (Exception exp) {
            ((MyException) exp).printMessage();
        }

        System.out.println("------------------------");

        try {
            new MyTest().test();
        } catch (MyException ex) {
            ex.printMessage();
        }

        System.out.println("------------------------");

        // Define an MyTest object reference and initialize it to null
        try {
            MyTest obj = null;
            obj.test();
        } catch (MyException exp) {
            System.out.println(exp);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
