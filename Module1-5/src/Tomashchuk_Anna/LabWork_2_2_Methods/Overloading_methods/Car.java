package Tomashchuk_Anna.LabWork_2_2_Methods.Overloading_methods;

public class Car {

    public void test(String s){
        System.out.println("test(String s)");
    }

    public void test(int i){
        System.out.println("test(int i)");
    }

    public void test(int[] arr){
        System.out.println("test(int[] arr)");
    }

    public int test(int i, double f){
        System.out.println("test(int i,double f)");
       return i+10;
    }
}
