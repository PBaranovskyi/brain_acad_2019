package tereshchenko_roman.inheritanceAndPolymorphism.MyShapes.com.brainacad.oop.testshapes;

public class Shape {

    private String shapeColor;
    private String shapeName = "Shape";

    public String getShapeColor() {
        return shapeColor;
    }

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public double calcArea() {
        double area = 0.0;
        return area;
    }

    @Override
    public String toString() {
        return "This is " + shapeName +
                ", color is: " + shapeColor;
    }
}