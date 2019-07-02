package bilan_max.Lab2_5;

import java.sql.SQLOutput;

public class MyInitTest {
    private int x;

    public MyInitTest() {
        this(1);
        System.out.println("Constructor 1");
    }

    public MyInitTest(int x) {
        this.x = x;
        System.out.println("Constructor 2");
    }

    {
        System.out.println("non static initialization block 1");
    }

    {
        System.out.println("non static initialization block 2");
    }

    static {
        System.out.println(" static initialization block 1");
    }

    static {
        System.out.println("static initialization block 2");
    }
}