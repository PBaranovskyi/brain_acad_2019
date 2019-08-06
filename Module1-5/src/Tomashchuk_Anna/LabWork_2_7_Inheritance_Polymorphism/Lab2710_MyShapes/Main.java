package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab2710_MyShapes;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape("RED");

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
        Rectangle rectangle3 = new Rectangle("WHITE", 7.0, 5.0);
        Rectangle rectangle4 = new Rectangle("PINC", 7.0, 5.0);
        Rectangle rectangle5 = new Rectangle("YELLOW", 7.0, 5.0);
        Rectangle rectangle6 = new Rectangle("BROUN", 7.0, 5.0);
        Circle circle2 = new Circle("PURPLE", 5.0);
        Circle circle3 = new Circle("GREEN", 8.0);
        Triangle triangle2 = new Triangle("BLACK", 3.0, 4.0, 2.5);
        Triangle triangle3 = new Triangle("BLACK", 3.0, 4.0, 2.5);

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
        for (int i = 1; i < arr.length; i++) {
            sumArea = sumArea + arr[i].calcArea();
        }

        System.out.println("SumArea: " + sumArea);


    }
}
