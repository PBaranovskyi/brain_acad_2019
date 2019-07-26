package mykhailo_kaloshyn.mainacad.testshapes;

public class Circle extends Shape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "This is: " + getClass().toString() + ", color is: " + getShapeColor() + ", radius is: " + radius;
    }

}
