package bilan_max.Lab2_10.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return super.toString() + ", radius=" + radius;
    }

    public static Circle parseCircle(String value) {
        String[] words = value.split(":");
        return new Circle(words[1], Double.parseDouble(words[2]));
    }
}

