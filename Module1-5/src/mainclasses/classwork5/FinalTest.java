package mainclasses.classwork5;

public class FinalTest {
    private final int a = 100;
    private final double b;
    private static final double c;


    static {
        c = 20;
    }

    {
        b = Math.random();
    }

    FinalTest (){
        this("test1");
    }

    FinalTest(String name){
        System.out.println(name);
    }

    FinalTest(int id){

    }

}
