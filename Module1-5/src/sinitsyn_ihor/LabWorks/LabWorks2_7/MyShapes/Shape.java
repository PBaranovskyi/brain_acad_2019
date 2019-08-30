package sinitsyn_ihor.LabWorks.LabWorks2_7.MyShapes;

abstract class Shape implements Drawable, Comparable {
    private String shapeColor;

    public abstract double calcArea();

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

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
        Shape other = (Shape) o;
        if (this.calcArea() > other.calcArea())
            return 1;
        if (this.calcArea() < other.calcArea())
            return -1;
        return 0;
    }

    public static Shape parseShape(String str) {
        Shape obj = null;
        String[] words = str.split(":");
        switch (words[0]) {
            case "Circle":
//                obj = new Circle(words[1], Double.parseDouble(words[2]));
                obj = Circle.parseCircle(str);
                break;
            case "Rectangle":
//                obj = new Rectangle(words[1], Double.parseDouble(words[2]), Double.parseDouble(words[3]));
                obj = Rectangle.parseRectangle(str);
                break;
            case "Triangle":
//                obj = new Triangle(words[1], Double.parseDouble(words[2]), Double.parseDouble(words[3]), Double.parseDouble(words[4]));
                obj = Triangle.parseTriangle(str);
                break;
        }
        return obj;
    }
}
