package sinitsyn_ihor.LabWorks.LabWorks2_7.MyShapes;

public class Circle extends Shape {
    private double radius;
    private String name = "Circle";
    public final double Pi = 3.1416;

    public Circle(String shapeColor, double rad) {
        super(shapeColor);
        this.radius = rad;
    }

    public double getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }

    @Override
    public double calcArea() {
        double area = (double) Math.round(Pi * radius * radius*100)/100.0;
        System.out.println("Circle area is: " + area);
        return area;
    }

    @Override
    public String toString() {
        System.out.println("This is " + this.getName() + ", color is " + this.getShapeColor() + ", radius: " + getRadius());
        return super.toString();
    }

    @Override
    public void draw() {
        this.calcArea();
        this.toString();
    }
}
