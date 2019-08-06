package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab278_MyShapes;

public class Rectangle extends Shape {
    private String shapeName = "Rectangle";
    private double width;
    private double height;

    //Add constructor
    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    //Rectangle override calcArea() method
    @Override
    public double calcArea() {
        return super.area = width * height;
    }

    @Override
    public String toString() {
        return "This is " + this.shapeName + ", color: " + super.getShapeColor() + " ,width=" + this.width + " ,heigth=" + this.height;
    }

}
