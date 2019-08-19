package tereshchenko_roman.exceptionsAndAssertions;

public class Main2 {
    public static void main(String[] args) {

        try {
            throw new MyException("This is exception");
        } catch (MyException exc) {
            exc.myExc();
        }
    }
}
