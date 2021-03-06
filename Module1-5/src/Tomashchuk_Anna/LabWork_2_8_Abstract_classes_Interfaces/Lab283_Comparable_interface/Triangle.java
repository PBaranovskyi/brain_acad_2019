package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.Lab283_Comparable_interface;

public class Triangle extends Shape implements Drawable, Comparable {
    private String shapeName = "Triangle";
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor) {
        super(shapeColor);
    }

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }


    // Triangle override calcArea() method
    @Override
    public double calcArea() {
        double s = (a + b + c) / 2;
        double x = s * (s - a) * (s - b) * (s - c);
        double area = Math.sqrt(x);
        return area;
    }

    @Override
    public String toString() {
        return "This is " + this.shapeName + ", color: " + super.getShapeColor() + ", a=" + a + ",b=" + b + ",c=" + c;
    }

    public void draw() {
        System.out.print(this);
        System.out.println(", area is " +this.calcArea());
    }

    @Override
    public int compareTo(Object o){
        Triangle triangle=(Triangle) o;
       if(this.calcArea()>triangle.calcArea()) return 1;
       if(this.calcArea()<triangle.calcArea()) return -1;
       return 0;
    }


}
