package sinitsyn_ihor.LabWorks.LabWorks2_5;

import mainclasses.Arrays;

public class MyInitTest {
    private int x;

    static {
        System.out.println("First static block");
    }

    static {
        System.out.println("Second static block");
    }

    {
        System.out.println("First on-static block");
    }

    {
        System.out.println("Second non-static block");
    }

    public MyInitTest() {
        this(1);
        System.out.println("Second construct");
    }

    public MyInitTest(int x) {
        System.out.println("First construct");
    }
}
