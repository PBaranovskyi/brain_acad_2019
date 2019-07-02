package tereshchenko_roman.initializationSections;

public class InitTest {

    private int id;
    private static int nextId;

    static {
        nextId = (int) (1000 * Math.random());
    }

    {
        nextId++;
        id = nextId;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        InitTest initTest1 = new InitTest();
        InitTest initTest2 = new InitTest();
        InitTest initTest3 = new InitTest();
        InitTest initTest4 = new InitTest();
        InitTest initTest5 = new InitTest();

        System.out.println(initTest1.getId());
        System.out.println(initTest2.getId());
        System.out.println(initTest3.getId());
        System.out.println(initTest4.getId());
        System.out.println(initTest5.getId());

    }
}
