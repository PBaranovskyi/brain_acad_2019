package tereshchenko_roman.methodOverloadResolution;

import mainclasses.Arrays;

public class Main2 {

    public static void main(String[] args) {

        foo(1,2);
        foo(1,2,3);
    }

    public static void foo (int a, int b) {
        System.out.println(a + "" + b);
    }

    public static void foo (int ... a) {
        System.out.println(a.toString());
    };
}
