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

    @Override
    public double calcArea() {
        double square = (sideA + sideB + sideC)/2;
        double area = (double) Math.round(Math.sqrt(square * (square - sideA) * (square - sideB) * (square - sideC))*100)/100.0;
        System.out.println("Triangle area is: " + area);
        return area;
    }

    @Override
    public String toString() {
        System.out.println("This is " + this.getName() + ", color is " + this.getShapeColor() + ", side A = " + getSideA() + ", side B = " + getSideB() + ", side C = " + getSideC());
        return super.toString();
    }
}
