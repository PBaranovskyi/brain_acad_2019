package tereshchenko_roman.initializationSections;

public class MyInitTest {
    {
        System.out.println("Non-static initialization block 1");
    }

    {
        System.out.println("Non-static initialization block 2");
    }

    static {
        System.out.println("Static initialization block 1");
    }

    static {
        System.out.println("Static initialization block 2");
    }

    public MyInitTest() {
        this(5);
        System.out.println("Constructor1");
    }

    public MyInitTest(int i) {
        System.out.println("Constructor2");
    }

    public static void main(String[] args) {
        MyInitTest test = new MyInitTest();
    }
}