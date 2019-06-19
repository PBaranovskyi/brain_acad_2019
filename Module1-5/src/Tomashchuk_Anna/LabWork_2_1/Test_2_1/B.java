package Tomashchuk_Anna.LabWork_2_1.Test_2_1;

public class B {
    private int x1;
    public void setX(int x){
        x1=x;
    }
    public int getX(){
        return x1;
    }
    public static void main(String[] args){
        B b=new B();
        b.setX(5);
        System.out.println(b.getX());
    }
}
