package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab276_MyShapes;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("RED");

        System.out.println(shape);
        System.out.println("Shape area is : " + shape.calcArea());
    }
}
