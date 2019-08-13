package mykhailo_kaloshyn.mainacad.lab2_8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle("white", 7, 40);
        Rectangle rec2 = new Rectangle("white", 1.4, 2.2);
        Rectangle rec3 = new Rectangle("black", 18.1, 14.8);
        Rectangle rec4 = new Rectangle("orange", 3.5, 3.3);
        Rectangle rec5 = new Rectangle("olive", 11, 22);

        Circle cir1 = new Circle("brown", 5.5);
        Circle cir2 = new Circle("yellow", 3);

        Triangle trian1 = new Triangle("black", 3.3, 6.0, 5.2);
        Triangle trian2 = new Triangle("yellow", 5, 5, 5);

        Shape[] arr = new Shape[]{rec1, rec2, rec3, rec4, rec5, cir1, cir2, trian1, trian2};

        Rectangle[] arr2 = new Rectangle[]{rec1, rec2, rec3, rec4, rec5};

        double sumRectArea = 0.0;
        double sumCircArea = 0.0;
        double sumTrianArea = 0.0;

        /*for (Shape shape : arr) {
            if (shape instanceof Rectangle)
                sumRectArea += shape.calcArea();
            if (shape instanceof Circle)
                sumCircArea += shape.calcArea();
            if (shape instanceof Triangle)
                sumTrianArea += shape.calcArea();
            System.out.println(shape + ", area is: " + shape.calcArea());
        }

        System.out.println();

        System.out.println("Sum of rectangles' area is: " + sumRectArea);
        System.out.println("Sum of circles' area is: " + sumCircArea);
        System.out.println("Sum of triangles' area is: " + sumTrianArea);*/

        System.out.println("=======================================================");

        for (Shape shape : arr) {
            shape.draw();
        }

        System.out.println(rec1.compareTo(rec2));

        Arrays.sort(arr2);
        for (Rectangle rectangle : arr2) {
            rectangle.draw();
        }


        //Arrays.sort(arr, );

        /*Shape shape1 = new Shape("green");

        System.out.println("This is " + shape1);
        System.out.println("Shape area is: " + shape1.calcArea());
        System.out.println();

        Circle circle1 = new Circle("green", 10.0);

        System.out.println(circle1);
        System.out.println("Shape area is: " + circle1.calcArea());
        System.out.println();

        Rectangle rectangle1 = new Rectangle("red", 11.0, 22.0);

        System.out.println(rectangle1);
        System.out.println("Shape area is: " + rectangle1.calcArea());
        System.out.println();

        Triangle triangle1 = new Triangle("black", 5.0, 5.0, 5.0);

        System.out.println(triangle1);
        System.out.println("Shape area is: " + triangle1.calcArea());
        System.out.println();*/
    }
}

