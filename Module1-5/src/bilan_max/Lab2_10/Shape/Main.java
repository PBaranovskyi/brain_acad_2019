package bilan_max.Lab2_10.Shape;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // lab 2-10-3 and 2-10-4
        Shape circle = Shape.parseShape("Circle:Blue:6");
        System.out.println(circle);
        Shape rect = Shape.parseShape("Rectangle:Red:10,8");
        System.out.println(rect);
        Shape triangle = Shape.parseShape("Triangle:Green:10,9,15");
        System.out.println(triangle);
    }

}
//        // lab 2-9-5
//        System.out.println("----------------------------------------------");
//        Scanner sc = new Scanner(System.in);
//        Shape[] arrayShape = createArrayShape(sc);
//        fillArrayShape(arrayShape, sc);
//        printArrayShape(arrayShape);
//    }
//
//    public static Shape[] createArrayShape(Scanner sc) {
//        System.out.print("Enter the size of the array of shape: ");
//        int size = sc.nextInt();
//        Shape[] arrayShapes = new Shape[size];
//        return arrayShapes;
//    }
//
//    public static void fillArrayShape(Shape[] array, Scanner sc) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("Enter the string describing the shape: ");
//            String shape = sc.next();
//            array[i] = Shape.parseShape(shape);
//        }
//    }
//
//    public static void printArrayShape(Shape[] array) {
//        for (Shape element : array)
//            element.draw();
//    }
//}
