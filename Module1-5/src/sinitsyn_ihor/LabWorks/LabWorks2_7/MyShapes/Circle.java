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

    public static Circle parseCircle(String str) {
        String[] words = str.split(":");
        Circle thisCircle = new Circle(words[1], Double.parseDouble(words[2]));
        System.out.println("This is " + words[0] + ", color: " + words[1] + ", radius:" + words[2] + ", area is: " + thisCircle.calcArea());
        return thisCircle;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return super.toString() + ", radius = " + radius;
    }


    @Override
    public void draw() {
        this.calcArea();
        this.toString();
    }
}
