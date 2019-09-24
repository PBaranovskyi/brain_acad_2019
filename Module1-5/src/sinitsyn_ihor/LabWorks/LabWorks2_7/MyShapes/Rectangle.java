package sinitsyn_ihor.LabWorks.LabWorks2_7.MyShapes;

public class Rectangle extends Shape {
    private double width;
    private double height;
    private String name = "Rectangle";

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public static Rectangle parseRectangle(String str) {
        String[] words = str.split(":");
        Rectangle thisRectangle = new Rectangle(words[1], Double.parseDouble(words[2]), Double.parseDouble(words[3]));
        System.out.println("This is " + words[0] + ", color: " + words[1] + ", width:" + words[2] + ", height: " + words[3] + ", area is: " + thisRectangle.calcArea());
        return thisRectangle;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString() + ", width = " + width + ", height = " + height;
    }

    @Override
    public void draw() {
        this.calcArea();
        this.toString();
    }
}
