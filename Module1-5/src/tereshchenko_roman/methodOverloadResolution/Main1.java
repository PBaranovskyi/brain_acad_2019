package tereshchenko_roman.methodOverloadResolution;

public class Main1 {

    public static void main(String[] args) {

        byte b = 5;

        foo(b);
    }


    public static void foo (int i) {
        System.out.println("int");
    }

    public static void foo (Byte b) {
        System.out.println("Byte");
    }
}
