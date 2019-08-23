package Tomashchuk_Anna.LabWork_2_11_Exceptions_Assertions.lab_2_11_4;


public abstract class Shape implements Drawable, Comparable {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return getClass().getSimpleName() + ", color: " + shapeColor;
    }

    @Override
    public void draw() {
        System.out.println(toString() + ",  area is: " + calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Shape other = (Shape)o;
        if (this.calcArea() > other.calcArea())
            return 1;
        if (this.calcArea() < other.calcArea())
            return -1;
        return 0;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    // Rewrite the parseShape(String) method in class Shape
    // to throw InvalidShapeStringException if string passed as method argument is not valid
    // Example of valid string: “Rectangle:RED:10,20”;
    // Example of invalid strings: “RectangRED12”; “sdzgdzhgd”;

    public static Shape parseShape(String str) throws InvalidShapeStringException {
        Shape obj = null;
        String[] words = str.split(":");
        String[] values = null;
        switch (words[0]) {
            case "Circle":
                obj = Circle.parseCircle(str);
                break;
            case "Triangle":
                obj = Triangle.parseTriangle(str);
                break;
            case "Rectangle":
                obj = Rectangle.parseRectangle(str);
                break;
            default:
                throw new InvalidShapeStringException();
        }
        return obj;
    }
}
