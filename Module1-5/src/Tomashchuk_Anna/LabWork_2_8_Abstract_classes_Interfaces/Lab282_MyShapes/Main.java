package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.Lab282_MyShapes;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle("WHITE");
        //shape1.draw();

        System.out.println(shape1);
        System.out.println("Shape area is : " + shape1.calcArea());
        System.out.println();

        Circle circle1 = new Circle("GREEN", 10.0);

        System.out.println(circle1);
        System.out.println("Shape area is : " + circle1.calcArea());
        System.out.println();

        Rectangle rectangle1 = new Rectangle("YELLOW", 11.0, 22.0);

        System.out.println(rectangle1);
        System.out.println("Shape area is : " + rectangle1.calcArea());

        System.out.println();

        Triangle triangle1 = new Triangle("BLACK", 5.0, 5.0, 5.0);
        System.out.println(triangle1);
        System.out.println("Shape area is : " + triangle1.calcArea());
        System.out.println();


        Rectangle rectangle2 = new Rectangle("BLUE", 7.0, 5.0);
        Rectangle rectangle3 = new Rectangle("WHITE", 4.0, 3.0);
        Rectangle rectangle4 = new Rectangle("PINC", 2.0, 1.0);
        Rectangle rectangle5 = new Rectangle("YELLOW", 6.0, 5.0);
        Rectangle rectangle6 = new Rectangle("BROUN", 8.0, 4.0);
        Circle circle2 = new Circle("PURPLE", 5.0);
        Circle circle3 = new Circle("GREEN", 8.0);
        Triangle triangle2 = new Triangle("BLACK", 3.0, 4.0, 2.5);
        Triangle triangle3 = new Triangle("BLACK", 5.0, 3.0, 6.2);

        Shape[] arr = new Shape[9];
        arr[0] = rectangle2;
        arr[1] = rectangle3;
        arr[2] = rectangle4;
        arr[3] = rectangle5;
        arr[4] = rectangle6;
        arr[5] = circle2;
        arr[6] = circle3;
        arr[7] = triangle2;
        arr[8] = triangle3;

        //Add code to iterate over shapes array in loop (use for-each loop)
        //to iterate- повторять
        for (Shape shape : arr) {
            System.out.print(shape);
            System.out.println(" area is: " + shape.calcArea());

        }
        System.out.println();

        double sumArea = 0.0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sumArea = sumArea + arr[i].calcArea();
        }
        System.out.println("SumArea: " + sumArea);
        System.out.println();

        double sumRectArea = 0.0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] instanceof Rectangle) {
                sumRectArea = sumRectArea + arr[i].calcArea();
            }
        }
        System.out.println("Rectangles total area: " + sumRectArea);
        System.out.println();

        double sumTriangleArea = 0.0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] instanceof Triangle) {
                sumTriangleArea = sumTriangleArea + arr[i].calcArea();
            }
        }
        System.out.println("Triangle total area: " + sumTriangleArea);
        System.out.println();

        double sumCircleArea = 0.0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] instanceof Circle) {
                sumCircleArea = sumCircleArea + arr[i].calcArea();
            }
        }
        System.out.println("Circle total area: " + sumCircleArea);
        System.out.println();

        Rectangle ob = new Rectangle("Red", 8.0, 9.0);
        ob.draw();
        System.out.println();

        Drawable[] i = new Drawable[3];
        i[0] = new Rectangle("RED", 4.7, 3.0);
        i[1] = new Triangle("YELLOW", 2.0, 4.5, 3.5);
        i[2] = new Circle("GREEN", 4.5);

        for (int x = 0; x < i.length; x++) {
            System.out.println(" " + i[x].getClass());
            i[x].draw();
        }

        int a=10;
        int b=10;
        System.out.println(a+b); // 20
        System.out.println(a=b); // 10

    }
}
