package Tomashchuk_Anna.LabWork_2_11_Exceptions_Assertions.Course;

public class Ciurse_finally {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (Exception ex) {
            System.out.println("catch");
            return;
        } finally { //finally - тут пишем код в любом случае, не важно произошел Exception или нет
            // finally игнорирует return
            System.out.println("finally");
        }
    }
}
