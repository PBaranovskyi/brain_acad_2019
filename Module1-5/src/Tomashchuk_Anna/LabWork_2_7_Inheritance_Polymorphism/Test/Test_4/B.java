package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Test.Test_4;

public class B extends A {
    public void job(){
        System.out.println("Class B");
    }

    public static void main(String[] args) {
        B b=new B();
        b.job();
    }
}
