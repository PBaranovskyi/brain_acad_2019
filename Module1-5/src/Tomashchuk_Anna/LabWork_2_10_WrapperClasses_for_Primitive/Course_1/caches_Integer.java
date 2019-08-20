package Tomashchuk_Anna.LabWork_2_10_WrapperClasses_for_Primitive.Course_1;

public class caches_Integer {
    public static void main(String[] args) {
        //caches Integer from range -128 to 127
        // 127 лежит в кэше, хоть это и Integer, оно приводится к примитивному
        Integer i1 = 127;
        Integer i2 = 127;

        Integer i3 = new Integer(127); // через new Integer - так не приводится к примитивам

        System.out.println(i1 == i2); // true - примитивы
        System.out.println(i2 == i3); // false
        System.out.println();

        Integer x1=128;
        Integer x2=128;

        Integer x3=new Integer(128);

        System.out.println(x1==x2); //false
        System.out.println(x2==x3); //false

    }
}
