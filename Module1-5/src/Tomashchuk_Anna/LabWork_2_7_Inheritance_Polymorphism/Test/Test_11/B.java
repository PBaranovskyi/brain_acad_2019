package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Test.Test_11;

public class B extends A {
    void a(){
        System.out.println("B-a");
    }

    void b(){
        System.out.println("B-b");
        super.b();
    }
}
