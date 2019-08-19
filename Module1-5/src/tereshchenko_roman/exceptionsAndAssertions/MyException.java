package tereshchenko_roman.exceptionsAndAssertions;

public class MyException extends Exception {

    String str;

    public MyException (String str){
        this.str = str;
    }

    public void myExc () {
        System.out.println(str);
    }

}
