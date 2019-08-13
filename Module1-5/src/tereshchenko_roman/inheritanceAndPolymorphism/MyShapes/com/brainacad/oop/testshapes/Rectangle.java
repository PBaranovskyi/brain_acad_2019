package tereshchenko_roman.inheritanceAndPolymorphism.MyShapes.com.brainacad.oop.testshapes;

public class Rectangle extends Shape implements Comparable{

    private double width = 20;
    private double heigth = 30;
    private String rectangleName = "Rectangle";

    public Rectangle(String shapeColor) {
        super(shapeColor);
    }

    public Rectangle (int shapeCode) {super(shapeCode);}

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

    @Override
    public void draw(Shape rectangle) {
        System.out.print(rectangle);
        System.out.println(", area is " + rectangle.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Rectangle rectangle = (Rectangle)o;
        if (this.calcArea()>rectangle.calcArea()) return 1;
        if (this.calcArea()<rectangle.calcArea()) return -1;
        return 0;
    }
}
