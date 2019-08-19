package tereshchenko_roman.exceptionsAndAssertions;

public class MyTest {



    public static void test() throws MyException {
        throw new MyException("MyTest Exception");
    }

    public static void main(String[] args) {

        try {
            test();
        } catch (MyException myExc){
            System.out.println("Test Exceprion");
        }

        MyTest myTestObj = null;

        try {
            myTestObj.test();
        }catch (MyException myExc){
            System.out.println("Test Exception with object");
        }

    }


}