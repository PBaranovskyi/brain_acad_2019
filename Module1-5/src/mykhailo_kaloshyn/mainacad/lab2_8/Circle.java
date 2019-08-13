package mykhailo_kaloshyn.mainacad.lab2_8;

public class Circle extends Shape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "This is: " + getClass().toString() + ", color is: " + getShapeColor() + ", radius is: " + radius;
    }

    @Override
    public void draw() {
        System.out.println("This is: " + getClass().toString() + ", color is: " + getShapeColor() + ", radius is: " + radius +
                "; area is: " + calcArea());
    }

  /*@Override
    public int compare(Object o1, Object o2) {
        Circle circle1 = (Circle) o1;
        Circle circle2 = (Circle) o2;
        int a1 = circle1.getShapeColor().length();
        int a2 = circle2.getShapeColor().length();
        int r = 0;

        for (int i = 0; i < Math.min(a1, a2); i++) {
            if (circle1.getShapeColor().charAt(i) > circle2.getShapeColor().charAt(i)) {
                r = 1;
                break;
            }

            if (circle1.getShapeColor().charAt(i) < circle2.getShapeColor().charAt(i)) {
                r = -1;
                break;
            }

            if (i < (a1 - 1) && i < (a2 - 1)) {
                continue;
            } else {
                break;
            }

        }

        return r;
    }*/

}