package tereshchenko_roman.wrapperClassesForPrimitiveTypes;

public class Main2 {

    static long compute (Byte b, Integer i){

        Long l = Long.valueOf(b + i);

        return l;
    };



    public static void main(String[] args) {

        System.out.println(compute((byte) 3, 250));

    }
}
