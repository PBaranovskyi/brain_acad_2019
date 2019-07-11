package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Sample_3_Getters_Setters;

public class Triangle extends TwoDShape {
    String style;


    double area() {
        // Использование методов доступа, предоставляемых суперклассом
        return getWidth() * getHeigth() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
