package sinitsyn_ihor.LabWorks.LabWorks2_6.shapes;

public class Triangle {
    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;
    private double area;

    public Triangle(double a, double b, double c) {
    }

    public Triangle() {
    }

    public double getArea() {
        double p = (a + b + c) / 2;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
}
