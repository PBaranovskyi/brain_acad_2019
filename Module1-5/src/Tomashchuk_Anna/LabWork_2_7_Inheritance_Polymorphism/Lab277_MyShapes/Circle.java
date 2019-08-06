package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab277_MyShapes;

public class Circle extends Shape {
    private double radius;
    public static final double PI = 3.14;
    private String shapeName = "Circle";

    //  public Circle(String shapeColor){super(shapeColor);}

    //Add constructor
    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    //override calcArea() method which must return area of circle
    @Override
    public double calcArea() {
        return super.area = PI * radius * radius;
    }

    @Override
    public String toString() {
        return "This is " + this.shapeName + " , color: " + super.getShapeColor() + ", radious=" + radius;
    }

}
