package tereshchenko_roman.methodOverloadResolution;

public class Main4 {

    public static void main(String[] args) {
        byte b = 5;

        foo(b);
        foo(5);
    }

    public static void foo (int i) {
        System.out.println("int");
    }

    public static void foo (byte b) {
        System.out.println("byte");
    }
}
