package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Book.Sample_3_Getters_Setters;

public class Shapes2 {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        Triangle t2=new Triangle();

        t1.setWidth(4.0);
        t1.setHeigth(4.0);
        t1.style="закрашенный";

        t2.setWidth(8.0);
        t2.setHeigth(12.0);
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
