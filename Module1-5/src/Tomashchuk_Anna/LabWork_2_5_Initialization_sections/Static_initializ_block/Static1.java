package Tomashchuk_Anna.LabWork_2_5_Initialization_sections.Static_initializ_block;

public class Static1 {
    private static int x;
    private int y;

    static{ // Static_initializ_block
        x=1234;
    }

    { // Non_static_initializ_block
        y=555;
    }

    public static void main(String[] args) {
        System.out.println(x);

        //System.out.println(y);  так не работает для Non_static - нестатических переменных
       // нужно создавать экземпляр класса
        Static1 static1=new Static1();
        System.out.println(static1.y);

    }
}
