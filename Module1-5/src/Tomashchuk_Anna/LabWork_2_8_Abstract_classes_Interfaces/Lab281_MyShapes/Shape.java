package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.Lab281_MyShapes;

abstract class Shape {
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

    abstract double calcArea();

}
