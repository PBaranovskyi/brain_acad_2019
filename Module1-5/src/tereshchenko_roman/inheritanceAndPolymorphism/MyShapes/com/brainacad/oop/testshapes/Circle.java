package tereshchenko_roman.inheritanceAndPolymorphism.MyShapes.com.brainacad.oop.testshapes;

public class Circle extends Shape {

    private double radius = 10;
    public static final double PI = 3.14;
    private String circleName = "Circle";


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
        return "This is " + circleName +
                ", color is: " + getShapeColor() + ", radius=" + radius;
    }
}
