package Tomashchuk_Anna.LabWork_2_10_WrapperClasses_for_Primitive.Lab210_1;

public class WrapperDemo_10 {
    public static void main(String[] args) {
        Integer x1=10;
        Integer x2=new Integer(10);
        Integer x4=Integer.valueOf(10); //.valueOf - пытается взять String и из него сделать int или byte
        Integer x5=Integer.parseInt("10");

        System.out.println(x1==x2); //false
        System.out.println(x1==x4); //true
        System.out.println(x1==x5); //true
        System.out.println(x2==x4);//false
        System.out.println(x2==x5); //false
        System.out.println(x4==x5); //true
        System.out.println();
        System.out.println(x1.equals(x2)); //true
        System.out.println(x1.equals(x4)); //true
        System.out.println(x1.equals(x5)); //true
        System.out.println(x2.equals(x4)); //true
        System.out.println(x2.equals(x5)); //true
        System.out.println(x4.equals(x5)); //true



    }

}
