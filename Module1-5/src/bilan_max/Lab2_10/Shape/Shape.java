package bilan_max.Lab2_10.Shape;


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

    public static Shape parseShape(String str) {
        Shape obj = null;
        String[] words = str.split(":");
        String[] values = null;
        switch (words[0]) {
            case "Circle":
                // lab 2_10_3
//                obj = new Circle(words[1], Double.parseDouble(words[2]));
                // lab 2_10_4
                obj = Circle.parseCircle(str);
                break;
            case "Triangle":
                // lab 2_10_3
//                values = words[2].split(",");
//                obj = new Triangle(words[1], Double.parseDouble(values[0]),
//                            Double.parseDouble(values[1]), Double.parseDouble(values[2]));
                // lab 2_10_4
                obj = Triangle.parseTriangle(str);
                break;
            case "Rectangle":
                // lab 2_10_3
//                values = words[2].split(",");
//                obj = new Rectangle(words[1], Double.parseDouble(values[0]),
//                        Double.parseDouble(values[1]));
                // lab 2_10_4
                obj = Rectangle.parseRectangle(str);
        }
        return obj;
    }
}
