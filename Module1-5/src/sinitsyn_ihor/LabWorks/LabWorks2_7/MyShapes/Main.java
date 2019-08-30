package sinitsyn_ihor.LabWorks.LabWorks2_7.MyShapes;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Shape[] arrayShape = createArrayShape(scan);
        fillArrayShape(arrayShape);
        printArrayShape(arrayShape);
    }

    public static Shape[] createArrayShape(Scanner scan) {
        System.out.print("Enter the size of the array of shape: ");
        int size = scan.nextInt();
        Shape[] arrayShapes = new Shape[size];
        return arrayShapes;
    }

    public static void fillArrayShape(Shape[] array) {
        String[] myArr = {"Circle", "Triangle", "Rectangle"};
        String[] myColor = {"Black", "White", "Green", "Blue", "Brown", "Yellow"};
        for (int i = 0; i < array.length; i++) {
            String shape = null;
            Random rand = new Random();
            String myShape = myArr[rand.nextInt(myArr.length)];
            switch (myShape) {
                case "Circle":
                    System.out.println("Circle!");
                    shape = (myShape + ":" + myColor[rand.nextInt(myColor.length)] + ":" + rand.nextDouble() * 100);
                    break;
                case "Rectangle":
                    System.out.println("Rectangle!");
                    shape = (myShape + ":" + myColor[rand.nextInt(myColor.length)] + ":" + rand.nextDouble() * 100 + ":" + rand.nextDouble() * 100);
                    break;
                case "Triangle":
                    System.out.println("Triangle!");
                    shape = (myShape + ":" + myColor[rand.nextInt(myColor.length)] + ":" + rand.nextDouble() * 100) + ":" + rand.nextDouble() * 100 + ":" + rand.nextDouble() * 100;
                    break;
                default:
                    shape = ("Circle:" + myColor[rand.nextInt(myColor.length)] + ":" + rand.nextDouble() * 100);
            }
            array[i] = Shape.parseShape(shape);
        }
    }

    public static void printArrayShape(Shape[] array) {
        for (Shape element : array)
            element.draw();
    }
//        System.out.println("Please, select your shape: 1 - Cirlce, 2 - Rectangle, 3 - Triangle");
//        double numb = scan.nextInt();
//        if (numb == 1) {
//            System.out.println("Please, set the radius of circle: ");
//            double radius = scan.nextDouble();
//            System.out.println("Set the color of circle now: ");
//            String shapeColor = scan.next();
//            Circle shapeCir = new Circle(shapeColor, radius);
////            shapeCir.toString();
////            shapeCir.calcArea();
//            shapeCir.draw();
//        } else if (numb == 2) {
//            System.out.println("Please, set the width of rectangle: ");
//            double width = scan.nextDouble();
//            System.out.println("Now, set the height of rectangle: ");
//            double height = scan.nextDouble();
//            System.out.println("And set the color of rectangle: ");
//            String shapeColor = scan.next();
//            Rectangle shapeRec = new Rectangle(shapeColor, width, height);
////            shapeRec.toString();
////            shapeRec.calcArea();
//            shapeRec.draw();
//        } else if (numb == 3) {
//            System.out.println("Please, set the side A of triangle: ");
//            double a = scan.nextDouble();
//            System.out.println("Now, set the side B of triangle: ");
//            double b = scan.nextDouble();
//            System.out.println("And now, set the side C of triangle: ");
//            double c = scan.nextDouble();
//            System.out.println("And set the color of triangle: ");
//            String shapeColor = scan.next();
//            Triangle shapeTri = new Triangle(shapeColor, a, b, c);
////            shapeTri.toString();
////            shapeTri.calcArea();
//            shapeTri.draw();
//        } else {
//            System.out.println("It was wrong number, try again...");
//        }
}
