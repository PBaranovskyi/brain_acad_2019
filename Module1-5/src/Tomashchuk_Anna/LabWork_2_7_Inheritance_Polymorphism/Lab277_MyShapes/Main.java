package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab277_MyShapes;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("RED");

        System.out.println(shape);
        System.out.println("Shape area is : " + shape.calcArea());
        System.out.println();

        Circle circle1 = new Circle("GREEN", 10.0);

        System.out.println(circle1);
        System.out.println("Shape area is : " + circle1.calcArea());

    }
}
