package tereshchenko_roman.inheritanceAndPolymorphism.MyShapes.com.brainacad.oop.testshapes;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
//        Shape shape1 = new Shape("RED");
//
//        System.out.println(shape1);
//        System.out.println("Shape area is : " + shape1.calcArea());
//
//        System.out.println();

//        Circle circle1 = new Circle("GREEN");
//
//        System.out.println(circle1);
//        System.out.println("Shape area is : " + circle1.calcArea());
//
//        System.out.println();
//
//        Rectangle rectangle1 = new Rectangle("BLUE");
//
//        System.out.println(rectangle1);
//        System.out.println("Shape area is : " + rectangle1.calcArea());
//
//        System.out.println();
//
//        Triangle triangle1 = new Triangle("BLACK");
//
//        System.out.println(triangle1);
//        System.out.println("Shape area is : " + triangle1.calcArea());
//
//        System.out.println();

        Rectangle rectangle2 = new Rectangle("Grey");
        Rectangle rectangle3 = new Rectangle("Violet");
        Rectangle rectangle4 = new Rectangle("Orange");
        Rectangle rectangle5 = new Rectangle("Brown");
        Rectangle rectangle6 = new Rectangle("Yellow");
        Circle circle2 = new Circle("Yellow");
        Circle circle3 = new Circle("Grey");
        Triangle triangle2 = new Triangle("Black");
        Triangle triangle3 = new Triangle("White");

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

        for (Shape arrShape : arr) {
            arrShape.draw(arrShape);
        }

        System.out.println();

        Rectangle compare1 = new Rectangle("White", 20, 30);
        Rectangle compare2 = new Rectangle("Grey", 100, 500);
        Rectangle compare3 = new Rectangle("Black", 1, 2);
        Rectangle compare4 = new Rectangle("Black", 2846, 6437);
        Rectangle compare5 = new Rectangle("Black", 389, 80);
        Rectangle compare6 = new Rectangle("Black", 50, 100000);

        Rectangle[] arrRectangles = {compare1, compare2, compare3, compare4, compare5, compare6};

        Arrays.sort(arrRectangles);
        System.out.println(Arrays.toString(arrRectangles));

        System.out.println();

        for (Rectangle rectangle : arrRectangles) {
            System.out.println(rectangle);
        }
//            {
//            System.out.print(shape);
//                System.out.println(" Area is: " + shape.calcArea());
//            }
//
//        System.out.println();
//
//        double sumArea = 0;
//        for (int i = 0; i < arr.length; i++) {
//        sumArea = sumArea + arr[i].calcArea();
//        }
//        System.out.println("All shapes' total area = " + sumArea);
//
//        System.out.println();
//
//        double sumRectArea = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] instanceof Rectangle){
//                sumRectArea = sumRectArea + arr[i].calcArea();
//            }
//        }
//        System.out.println("Rectangles' total area = " + sumRectArea);
//
//        System.out.println();
//
//        double sumTriangleArea = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] instanceof Triangle){
//                sumTriangleArea = sumTriangleArea + arr[i].calcArea();
//            }
//        }
//        System.out.println("Triangles' total area = " + sumTriangleArea);
//
//        System.out.println();
//
//        double sumCircleArea = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] instanceof Circle){
//                sumCircleArea = sumCircleArea + arr[i].calcArea();
//            }
//        }
//        System.out.println("Circles' total area = " + sumCircleArea);
//
//
//            };
//        }
    }
}

