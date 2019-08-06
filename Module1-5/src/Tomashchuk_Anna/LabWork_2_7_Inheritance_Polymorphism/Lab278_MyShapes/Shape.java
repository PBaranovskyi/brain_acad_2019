package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab278_MyShapes;

public class Shape {
    private String shapeColor;
    private String shapeName = "Shape";
    protected double area = 0.0;

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    Shape(String shapeColor) {
        setShapeColor(shapeColor);
    }

    @Override
    public String toString() {
        return "This is " + this.shapeName + ", color is: " + this.getShapeColor();
    }

    public double calcArea() {
        return area;
    }

}
