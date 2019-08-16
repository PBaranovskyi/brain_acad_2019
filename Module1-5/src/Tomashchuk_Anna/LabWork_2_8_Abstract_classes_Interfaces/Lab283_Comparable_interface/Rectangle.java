package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.Lab283_Comparable_interface;

public class Rectangle extends Shape implements Drawable, Comparable {
    private String shapeName = "Rectangle";
    private double width;
    private double height;

    //Add constructor
    public Rectangle(String shapeColor) {
        super(shapeColor);
    }

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    public Rectangle(int shapeCode){super(shapeCode);}


    //Rectangle override calcArea() method
    @Override
    public double calcArea() {
        double area = width * height;
        return area;
    }

    @Override
    public String toString() {
        return "This is " + this.shapeName + ", color: " + super.getShapeColor() + " ,width=" + this.width + " ,heigth=" + this.height;
    }

    @Override
    public void draw(){
        System.out.print(this);
        System.out.println(", area is " +this.calcArea());
    }


    @Override
    public int compareTo(Object o) {
        Rectangle rectangle=(Rectangle) o;
        if(this.calcArea()>rectangle.calcArea()) return 1;
        if(this.calcArea()<rectangle.calcArea()) return -1;
        return 0;
    }
}
