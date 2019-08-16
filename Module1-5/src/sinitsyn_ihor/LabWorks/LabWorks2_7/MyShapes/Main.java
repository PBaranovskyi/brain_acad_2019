package sinitsyn_ihor.LabWorks.LabWorks2_7.MyShapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, select your shape: 1 - Cirlce, 2 - Rectangle, 3 - Triangle");
        double numb = scan.nextInt();
        if (numb == 1) {
            System.out.println("Please, set the radius of circle: ");
            double radius = scan.nextDouble();
            System.out.println("Set the color of circle now: ");
            String shapeColor = scan.next();
            Circle shapeCir = new Circle(shapeColor, radius);
            shapeCir.toString();
            shapeCir.calcArea();
        }
        else if (numb == 2) {
            System.out.println("Please, set the width of rectangle: ");
            double width = scan.nextDouble();
            System.out.println("Now, set the height of rectangle: ");
            double height = scan.nextDouble();
            System.out.println("And set the color of rectangle: ");
            String shapeColor = scan.next();
            Rectangle shapeRec = new Rectangle(shapeColor, width, height);
            shapeRec.toString();
            shapeRec.calcArea();
        }
        else if (numb == 3) {
            System.out.println("Please, set the side A of triangle: ");
            double a = scan.nextDouble();
            System.out.println("Now, set the side B of triangle: ");
            double b = scan.nextDouble();
            System.out.println("And now, set the side C of triangle: ");
            double c = scan.nextDouble();
            System.out.println("And set the color of triangle: ");
            String shapeColor = scan.next();
            Triangle shapeTri = new Triangle(shapeColor, a, b, c);
            shapeTri.toString();
            shapeTri.calcArea();
        }
        else {
            System.out.println("It was wrong number, try again...");
        }
    }
}
