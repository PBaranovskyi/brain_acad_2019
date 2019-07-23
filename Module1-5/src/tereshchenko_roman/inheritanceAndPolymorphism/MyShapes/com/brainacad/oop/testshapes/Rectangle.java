package tereshchenko_roman.inheritanceAndPolymorphism.MyShapes.com.brainacad.oop.testshapes;

public class Rectangle extends Shape {

    private double width = 20;
    private double heigth = 30;
    private String rectangleName = "Rectangle";

    public Rectangle(String shapeColor) {
        super(shapeColor);
    }

    public Rectangle(String shapeColor, double width, double heigth) {
        super(shapeColor);
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public double calcArea() {
        double area = width * heigth;
        return area;
    }

    @Override
    public String toString() {
        return "This is " + rectangleName +
                ", color is: " + getShapeColor() + ", width=" + width + ", heigth=" + heigth;
    }
}
