package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.Lab283_Comparable_interface;

abstract class Shape implements Drawable {
    private String shapeColor;
    private String shapeName = "Shape";
    private int shapeCode;

    public String getShapeColor() {
        return shapeColor;
    }

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public int getShapeCode() {return shapeCode;}

    public Shape(int shapeCode){this.shapeCode=shapeCode;}

    abstract double calcArea();

}
