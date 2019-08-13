package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.Lab282_MyShapes;

public class Rectangle extends Shape implements Drawable {
    private String shapeName = "Rectangle";
    private double width;
    private double height;

    //Add constructor
    public Rectangle(String shapeColor) {
        super(shapeColor);
    }

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }


    //Rectangle override calcArea() method
    @Override
    public double calcArea() {
        double area = width * height;
        return area;
    }

    @Override
    public String toString() {
        return "This is " + this.shapeName + ", color: " + super.getShapeColor() + " ,width=" + this.width + " ,heigth=" + this.height;
    }

    @Override
    public void draw(){
        System.out.println(this);
        System.out.println(getClass().getName());
        shapeName="RED";
        width=6.7;
        height=4.0;
    }

}
