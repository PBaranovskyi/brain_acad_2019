package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab279_MyShapes;

public class Triangle extends Shape {
    private String shapeName = "Triangle";
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Triangle override calcArea() method
    @Override
    public double calcArea() {
        double s = (a + b + c) / 2;
        double x = s * (s - a) * (s - b) * (s - c);
        return super.area = Math.sqrt(x);
    }

    @Override
    public String toString() {
        return "This is " + this.shapeName + ", color: " + super.getShapeColor() + ", a=" + a + ",b=" + b + ",c=" + c;
    }

}
