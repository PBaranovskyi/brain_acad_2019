package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.Lab281_MyShapes;

public class Circle extends Shape {
    private double radius;
    public static final double PI = 3.14;
    private String shapeName = "Circle";

    //Add constructor
    public Circle(String shapeColor) {
        super(shapeColor);
    }

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        double area = PI * radius * radius;
        return area;
    }

    @Override
    public String toString() {
        return "This is " + this.shapeName + " , color: " + super.getShapeColor() + ", radious=" + radius;
    }

}
