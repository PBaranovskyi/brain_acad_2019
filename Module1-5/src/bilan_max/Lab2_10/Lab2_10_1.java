package bilan_max.Lab2_10;

public class Lab2_10_1 {
    public static void main(String[] args) {
        Integer x1=10;
        Integer x2=new Integer(10);
        Integer x3=Integer.valueOf(10);
        Integer x4=Integer.parseInt("10");
        System.out.println(x1==x2);
        System.out.println(x2==x3);
        System.out.println(x3==x4);
        System.out.println(x1==x4);
        System.out.println();
        System.out.println(x1.equals(x2));
        System.out.println(x2.equals(x3));
        System.out.println(x3.equals(x4));
        System.out.println(x1.equals(x4));
        System.out.println();
        Integer x5=200;
        Integer x6=new Integer(200);
        Integer x7=Integer.valueOf(200);
        Integer x8=Integer.parseInt("200");
        System.out.println(x5==x6);
        System.out.println(x6==x7);
        System.out.println(x7==x8);
        System.out.println(x5==x8);
        System.out.println();
        System.out.println(x5.equals(x6));
        System.out.println(x6.equals(x7));
        System.out.println(x7.equals(x8));
        System.out.println(x5.equals(x8));
        }
    }
