package tereshchenko_roman.inheritanceAndPolymorphism.MyShapes.com.brainacad.oop.testshapes;

public class Triangle extends Shape {
    private double a = 5;
    private double b = 6;
    private double c = 7;
    private String triangleName = "Triangle";

    public Triangle(String shapeColor){
        super(shapeColor);
    }

    public Triangle(String shapeColor, double a, double b, double c){
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double calcArea() {
        double s = ((a + b + c)/2);
        double area = (Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        return area;
    }

    @Override
    public String toString() {
        return "This is " + triangleName +
                ", color is: " + getShapeColor() + ", a=" + a + ", b=" + b + ", c=" + c;
    }
}
