package Tomashchuk_Anna.LabWork_2_5_Initialization_sections.Non_static_initializ_block;

public class NonStatic1 {
    private int i;
    private String str;
//Блоки инициализатора для переменных экземпляра
    {
        i = 12345;
        str = "Hi";
    }

    public static void main(String[] args) {
        NonStatic1 nonStatic1 = new NonStatic1();
        System.out.println("int: " + nonStatic1.i);
        System.out.println("String: " + nonStatic1.str);
    }
}


