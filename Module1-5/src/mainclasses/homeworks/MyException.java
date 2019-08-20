package mainclasses.homeworks;

public class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }

    public void printMessage() {
        System.out.println(this.getMessage());
    }
}
