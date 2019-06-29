package Tomashchuk_Anna.LabWork_2_5_Initialization_sections.Order_of_Initializ_block;

public class ClassInitDemo2 {
    //После загрузки класса в память его статические поля данных
    // и блок статической инициализации выполняются в порядке их появления в классе.
    private static int x=100;
    static { //static 1
        x=1;
        System.out.println("static block 1");
    }

    static{ //static 2
        x=2;
        System.out.println("static block 2");
    }

    public static void main(String[] args) {
        System.out.println("main");
        System.out.println("x="+x); //x=2 , потому что переменная переопределяется
    }
}
