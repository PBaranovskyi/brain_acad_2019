package Tomashchuk_Anna.LabWork_2_5_Initialization_sections.Lab251;

public class MyInitTest {
    public int width;

    static{
        System.out.println("static initialization block 1");
    }
    static{
        System.out.println("static initialization block 2");
    }
    {
        System.out.println("non-static initialization block 1");
    }
    {
        System.out.println("non-static initialization block 2");
    }


    public MyInitTest( int wid) {
        this.width=wid;
        System.out.println("constructor 1");
    }

    public MyInitTest() {
        this(3);
        System.out.println("constructor 2");

    }

}
