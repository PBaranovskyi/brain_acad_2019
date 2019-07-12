package Tomashchuk_Anna.LabWork_2_2_Methods.Lab225;

public class A {
    public int calcSquareRectangle(int a, int b) {
        System.out.println("Square of rectangle with sides int: " + a + " and " + b);
        return a * b;
    }

    public double calcSquareRectangle(double a, double b) {
        System.out.println("Square of rectangle with sides double: " + a + " and " + b);
        return a * b;
    }

    public int calcSquareFoursquare(int a) {
        System.out.println("Square of foursquare with sides int: " + a);
        return a * a;
    }

    public double calcSquareFoursquare(double a) {
        System.out.println("Square of foursquare with sides double:  " + a);
        return a * a;
    }

    public double calcSquareCircle(int r, final double pi) {
        System.out.println("Square of circle with radius int: " + r);
        return pi * r * r; // Площадь круга с радиусом r равна πr2 , π ≈ 3.14159
    }

    public double calcSquareCircle(double r, final double pi) {
        System.out.println("Square of circle with radius double: " + r);
        return pi * r * r;
    }

    public int calcFinal(final int f) {
        System.out.println("Final: " + f);
        return f * f;
    }
}
