package sinitsyn_ihor.LabWorks.LabWorks2_7.MyShapes;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private String name = "Triangle";

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public String getName() {
        return name;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public static Triangle parseTriangle(String str) {
        String[] words = str.split(":");
        return new Triangle(words[1], Double.parseDouble(words[2]), Double.parseDouble(words[3]), Double.parseDouble(words[4]));
    }

    @Override
    public double calcArea() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public String toString() {
        return super.toString() + ", side a = " + sideA + ", side b = " + sideB + ", side c = " + sideC;
    }

    @Override
    public void draw() {
        this.calcArea();
        this.toString();
    }
}
