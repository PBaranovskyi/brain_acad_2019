package sinitsyn_ihor.LabWorks.LabWorks2_5;

public class InitTest {
    private int id;
    private static int nextid;
    static {
        nextid = (int)(1000*Math.random());
        System.out.println("My nextid is " + nextid);
    }

    {
        nextid++;
        id = nextid;
    }

    public int getId() {
        return id;
    }
}
