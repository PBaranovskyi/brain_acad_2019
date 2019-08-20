package bilan_max.Lab2_10;

public class Lab2_10_2 {
    static  long compute(Byte a,Integer b){
    long c=Long.valueOf(a+b);
    return c;
    }

    public static void main(String[] args) {
        System.out.println(compute((byte) 5,678));
    }
}