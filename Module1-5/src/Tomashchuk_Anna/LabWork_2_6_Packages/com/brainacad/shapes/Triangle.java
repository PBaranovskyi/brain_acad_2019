package Tomashchuk_Anna.LabWork_2_6_Packages.com.brainacad.shapes;

public class Triangle {
    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
}
