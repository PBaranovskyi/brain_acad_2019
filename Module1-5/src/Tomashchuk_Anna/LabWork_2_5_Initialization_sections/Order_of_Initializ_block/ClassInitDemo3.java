package Tomashchuk_Anna.LabWork_2_5_Initialization_sections.Order_of_Initializ_block;

public class ClassInitDemo3 {
    private int y=100;
    { y=1; // non-static 1
        System.out.println("non-static block 1");
    }
    public ClassInitDemo3(){
        y=3;
        System.out.println("constructor");
    }
    { y=2; // non-static 2
        System.out.println("non-static block 2");
    }
    public static void main(String[] args) {
        System.out.println("main");
        ClassInitDemo3 cdm=new ClassInitDemo3();
        System.out.println("y="+cdm.y);
    }
}
