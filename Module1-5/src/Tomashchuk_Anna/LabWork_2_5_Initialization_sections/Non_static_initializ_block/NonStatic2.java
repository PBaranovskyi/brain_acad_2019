package Tomashchuk_Anna.LabWork_2_5_Initialization_sections.Non_static_initializ_block;

public class NonStatic2 {
    private  int x;

   {
        x=1234;
    }


    public static void main(String[] args) {
        NonStatic2 nonStatic2=new NonStatic2();
       // System.out.println(x);// так не работает для Non_static - нестатических переменных
        System.out.println(nonStatic2.x);


    }
}
