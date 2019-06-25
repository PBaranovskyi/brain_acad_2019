package mainclasses.classwork4; //ffff

import java.util.Random;

public class A {

    private static int variable ;

//    public A (){
////        this(new A());
////        this.variable = 6;
//    }

//    public  A(A obj){
//        System.out.println(obj);
//    }

    void m1(A income) {
        System.out.println("Text" );
    }

    void m2 (){
        m1(this);
    }

    public static void main(String[] args) {
//        A obj = new A();
//        obj.m2();
//
//        obj.m1(obj);

        System.out.println(A.variable);


        Random newObj = new Random();
        newObj.nextInt(123);

    }
}
