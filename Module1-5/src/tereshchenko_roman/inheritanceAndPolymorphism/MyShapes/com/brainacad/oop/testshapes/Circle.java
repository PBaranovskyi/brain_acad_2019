package tereshchenko_roman.inheritanceAndPolymorphism.MyShapes.com.brainacad.oop.testshapes;

public class Circle extends Shape implements Comparable {

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

    @Override
    public void draw(Shape circle) {
        System.out.print(circle);
        System.out.println(", area is " + circle.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle) o;
        if (this.calcArea()>circle.calcArea()) return 1;
        if (this.calcArea()<circle.calcArea()) return -1;
        return 0;
    }
}
