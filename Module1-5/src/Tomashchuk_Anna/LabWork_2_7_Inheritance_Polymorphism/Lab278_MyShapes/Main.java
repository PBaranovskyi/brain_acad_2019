package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab278_MyShapes;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("RED");

        System.out.println(shape);
        System.out.println("Shape area is : " + shape.calcArea());
        System.out.println();

        Circle circle1 = new Circle("GREEN", 10.0);

        System.out.println(circle1);
        System.out.println("Shape area is : " + circle1.calcArea());
        System.out.println();

        Rectangle rectangle1 = new Rectangle("YELLOW", 11.0, 22.0);

        System.out.println(rectangle1);
        System.out.println("Shape area is : " + rectangle1.calcArea());
        System.out.println();

    }
}
