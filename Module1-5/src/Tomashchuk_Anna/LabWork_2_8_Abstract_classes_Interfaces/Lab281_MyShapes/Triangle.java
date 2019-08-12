package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.Lab281_MyShapes;

public class Triangle extends Shape {
    private String shapeName = "Triangle";
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor) {
        super(shapeColor);
    }

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }


    // Triangle override calcArea() method
    @Override
    public double calcArea() {
        double s = (a + b + c) / 2;
        double x = s * (s - a) * (s - b) * (s - c);
        double area = Math.sqrt(x);
        return area;
    }

    @Override
    public String toString() {
        return "This is " + this.shapeName + ", color: " + super.getShapeColor() + ", a=" + a + ",b=" + b + ",c=" + c;
    }

}
