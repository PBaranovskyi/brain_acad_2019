package Tomashchuk_Anna.LabWork_2_11_Exceptions_Assertions.Course.Course_2_finally;

public class Main {
    public static void testExcp() {
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
    public static void main(String[] args) {
        System.out.println("start");
        testExcp();
        System.out.println("end");

    }
}
