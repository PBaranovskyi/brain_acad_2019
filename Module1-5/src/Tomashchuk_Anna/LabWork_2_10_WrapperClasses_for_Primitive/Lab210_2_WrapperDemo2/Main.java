package Tomashchuk_Anna.LabWork_2_10_WrapperClasses_for_Primitive.Lab210_2_WrapperDemo2;


public class Main {
    static long compute(Byte b, Integer i) {
        Long l = Long.valueOf(b + i);
        return l;
    }

    ;

    public static void main(String[] args) {
        System.out.println(compute((byte) 3, 250));
    }
}
