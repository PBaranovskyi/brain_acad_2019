package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Sample_1;

public class Shapes {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        Triangle t2=new Triangle();

// Объектам типа Triangle доступны все члены класса Triangle,
// даже те, которые унаследованы от класса TwoDShape
        t1.width=4.0;
        t1.heigth=4.0;
        t1.style="закрашенный";

        t2.width=8.0;
        t2.heigth=12.0;
        t2.style="контурный";

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - "+ t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - "+ t2.area());

    }
}
