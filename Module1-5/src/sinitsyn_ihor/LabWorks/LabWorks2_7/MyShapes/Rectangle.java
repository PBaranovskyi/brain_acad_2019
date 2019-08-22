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

    @Override
    public double calcArea() {
        double area = Math.round(width * height*100)/100.0;
        System.out.println("Rectangle area is: " + area);
        return area;
    }

    @Override
    public String toString() {
        System.out.println("This is " + this.getName() + ", color is " + this.getShapeColor() + ", width: " + getWidth() + ", height: " + getHeight());
        return super.toString();
    }

    @Override
    public void draw() {
        this.calcArea();
        this.toString();
    }
}
