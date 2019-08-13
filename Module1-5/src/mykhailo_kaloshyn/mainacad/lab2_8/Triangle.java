package mykhailo_kaloshyn.mainacad.lab2_8;

public class Triangle extends Shape {

    private double a, b, c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double s = (a + b + c) / 2;
        double area = Math.sqrt((s * (s - a) * (s - b) * (s - c)));
        return area;
    }

    @Override
    public String toString() {
        return "This is: " + getClass() + ", color is: " + getShapeColor() + ", a = " + a + ", b = " + b + ", c = " + c;
    }

    @Override
    public void draw() {
        System.out.println("This is: " + getClass() + ", color is: " + getShapeColor() + ", a = " + a + ", b = " + b +
                ", c = " + c + "; area is: " + calcArea());
    }
}
