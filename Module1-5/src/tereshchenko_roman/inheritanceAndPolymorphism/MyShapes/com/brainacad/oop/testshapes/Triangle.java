package tereshchenko_roman.inheritanceAndPolymorphism.MyShapes.com.brainacad.oop.testshapes;

public class Triangle extends Shape implements Comparable {
    private double a = 5;
    private double b = 6;
    private double c = 7;
    private String triangleName = "Triangle";

    public Triangle(String shapeColor) {
        super(shapeColor);
    }

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double calcArea() {
        double s = ((a + b + c) / 2);
        double area = (Math.sqrt(s * (s - a) * (s - b) * (s - c)));
        return area;
    }

    @Override
    public String toString() {
        return "This is " + triangleName +
                ", color is: " + getShapeColor() + ", a=" + a + ", b=" + b + ", c=" + c;
    }

    @Override
    public void draw() {
        System.out.print(this);
        System.out.println(", area is " + this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Triangle triangle = (Triangle) o;
        if (this.calcArea()>triangle.calcArea()) return 1;
        if (this.calcArea()<triangle.calcArea()) return -1;
        return 0;
    }
}
