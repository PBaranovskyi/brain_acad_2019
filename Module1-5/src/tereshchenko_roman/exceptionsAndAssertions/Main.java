package tereshchenko_roman.exceptionsAndAssertions;

public class Main {
    public static void main(String[] args) {
            try {
            throw new Exception("Exception");
        } catch (Exception exc) {
            System.out.println(exc);
        }
            finally {
                System.out.println("Finally");
            }
    }
}
