package mykhailo_kaloshyn.mainacad.lab2_8;

public class Rectangle extends Shape implements Comparable {

    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "This is: " + getClass() + ", color is: " + getShapeColor() + ", width = " + width + ", height = " + height;
    }

    @Override
    public void draw() {
        System.out.println("This is: " + getClass() + ", color is: " + getShapeColor() + ", width = " + width + ", height = " + height +
                "; area is: " + calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Rectangle rectangle = (Rectangle) o;
        if (this.calcArea() > rectangle.calcArea()) return 1;
        if (this.calcArea() < rectangle.calcArea()) return -1;
        return 0;
    }
}