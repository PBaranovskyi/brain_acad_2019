package mykhailo_kaloshyn.mainacad.lab2_2.myA;

public class A {

    static void calcSquare(double r) {
        double squareOfCircle = 3.14 * r * r;
        System.out.println("The square of circle with " + r + " radius is: " + squareOfCircle);
    }

    static void calcSquare(double a, double b) {
        double squareOfFigure = a * b;
        if (a == b) {
            System.out.println("The square of foursquare with the " + a + " side is:" + squareOfFigure);
        } else {
            System.out.println("The square of rectangle with the following sides (" + a + ", and " + b + ") is: " + squareOfFigure);
        }

    }
}
