package Tomashchuk_Anna.LabWork_2_2_Methods.Test_Methods;
public class A {
    public static void main(String[] args) {
        A a=new A();
        a.met(10,1);
    }
    void met(final int a, int b){
        b*=a;
      //  a+=b;
        System.out.println(a);
    }
}
