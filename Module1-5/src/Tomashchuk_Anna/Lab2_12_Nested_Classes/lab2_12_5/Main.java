package Tomashchuk_Anna.Lab2_12_Nested_Classes.lab2_12_5;

public class Main {
    public static void main(String[] args) {
        // Create class Main with method main() and add code that accesses the nested classes’
        //members from the outer class. Create code that accesses the outer class’s members
        //from within the nested classes.

        MyTestClass myTestClass = new MyTestClass();
        myTestClass.test();
        myTestClass.method();

        MyTestClass.MyStaticNested obj_1 = new MyTestClass.MyStaticNested();
        obj_1.testStaticNested();

        MyTestClass.MyInner obj_2 = myTestClass.new MyInner();
        obj_2.testInner();
    }
}
