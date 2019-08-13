package mykhailo_kaloshyn.mainacad.lab2_8;

abstract class Shape implements Drawable{

    private String shapeColor;

    public Shape() {
    }

    public Shape(String color) {
        this.shapeColor = color;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract double calcArea ();

    @Override
    public String toString() {
        return getClass().toString() + ", color is: " + shapeColor;
    }
}
