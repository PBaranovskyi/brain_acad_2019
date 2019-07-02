package Tomashchuk_Anna.LabWork_2_5_Initialization_sections.Lab255;

public class InitTest {
    private int id;
    private static int nextId;

    // Initialize static field nextId of some random value (in 1 … 1000 range) once when class loaded to JVM
    static {
        nextId = (int) (1000 * Math.random());
        System.out.println("nextId: " + nextId);
    }

    { //Increments static field nextId each time when new instance of InitTest created
        nextId++;
    }

    //Initialize field id of nextId field value each time when new instance of InitTest created.
    {
        id = nextId;
    }

    // method getId() which will return value of id
    public int getId() {
        return id;
    }
}
