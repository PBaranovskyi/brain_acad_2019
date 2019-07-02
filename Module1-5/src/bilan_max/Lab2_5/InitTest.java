package bilan_max.Lab2_5;

public class InitTest {
    private int id;
    private static int nextId;

    static {
        nextId = (int) (1000 * Math.random());
        System.out.println("initial nextId: " + nextId);
    }

    {
        nextId++;
    }

    public InitTest() {
        this.id = nextId;
    }

    public int getId() {
        return id;
    }
}



