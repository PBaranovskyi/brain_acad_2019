package Tomashchuk_Anna.LabWork_2_5_Initialization_sections.Order_of_Initializ_block;

public class ClassInitDemo1 {
    //В какой последовательности отработают комманды
    public ClassInitDemo1(){
        System.out.println("constructor");
    }

    {//non-static
        System.out.println("non-static block");
    }

   static { //static
       System.out.println("static block");
    }

    public static void main(String[] args) {
        System.out.println("main");
        ClassInitDemo1 cdm=new ClassInitDemo1();
    }
}
