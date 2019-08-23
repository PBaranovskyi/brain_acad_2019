package Tomashchuk_Anna.LabWork_2_11_Exceptions_Assertions.lab_2_11_2;

public class MyException extends Exception {
    // Create your own exception class MyException
    private String message;

    public MyException(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
    }
}
