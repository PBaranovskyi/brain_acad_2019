package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.Lab283_Comparable_interface;

public class Circle extends Shape implements Drawable, Comparable {
    private double radius;
    public static final double PI = 3.14;
    private String shapeName = "Circle";

    //Add constructor
    public Circle(String shapeColor) {
        super(shapeColor);
    }

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        double area = PI * radius * radius;
        return area;
    }

    @Override
    public String toString() {
        return "This is " + this.shapeName + " , color: " + super.getShapeColor() + ", radious=" + radius;
    }

    @Override
    public void draw(){
        System.out.print(this);
        System.out.println(", area is " +this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Circle circle=(Circle) o;
        if(this.calcArea()>circle.calcArea()) return 1;
        if(this.calcArea()<circle.calcArea()) return -1;
        return 0;
    }
}
