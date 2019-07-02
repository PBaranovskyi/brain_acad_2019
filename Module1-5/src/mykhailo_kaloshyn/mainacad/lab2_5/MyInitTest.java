package mykhailo_kaloshyn.mainacad.lab2_5;

public class MyInitTest {

    private int a;

    {
        System.out.println("Non-static initialization block #1");
    }

    {
        System.out.println("Non-static initialization block #2");
    }

    static {
        System.out.println("Static initialization block #1");
    }

    static {
        System.out.println("Static initialization block #2");
    }

    public MyInitTest() {
        this.a = 5;
        System.out.println("Constructor #1");
    }

    public MyInitTest(int a) {
        this.a = a;
        System.out.println("Constructor #2");
    }
}
