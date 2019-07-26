package mykhailo_kaloshyn.mainacad.testshapes;

public class Shape {

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

    public double calcArea () {
      return 0.0;
    }

    @Override
    public String toString() {
        return getClass().toString() + ", color is: " + shapeColor;
    }
}
