package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab2710_MyShapes;

public class Shape {
    private String shapeColor;
    private String shapeName = "Shape";

    public String getShapeColor() {
        return shapeColor;
    }

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {

        return "This is " + this.shapeName + ", color is: " + this.shapeColor;
    }

    public double calcArea() {
        double area = 0.0;
        return area;
    }

}
