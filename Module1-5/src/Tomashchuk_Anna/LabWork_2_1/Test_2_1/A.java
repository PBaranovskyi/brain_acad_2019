package Tomashchuk_Anna.LabWork_2_1.Test_2_1;

public class A {
    void method1(A obj){
        System.out.println("method is invoked");
    }
    void method2(){
        method1(this);
    }

    public static void main(String[] args) {
        A s1=new A();
        s1.method2();
    }
}
