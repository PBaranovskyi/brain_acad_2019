package Tomashchuk_Anna.LabWork_2_11_Exceptions_Assertions.lab_2_11_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Shape circle = Shape.parseShape("Circle:Blue:6");
//            Shape circle = Shape.parseShape("CircleBlue:10");
            circle.draw();
            Shape rect = Shape.parseShape("Rectangle:Red:10,8");
//            Shape rect = Shape.parseShape("Rectangle:Red10,8");
            rect.draw();
            Shape triangle = Shape.parseShape("Triangle:Green:10,9,15");
//            Shape triangle = Shape.parseShape("Tringle:Green:10,9,15");
            triangle.draw();
        } catch (InvalidShapeStringException ee) {
            System.out.println("A string describing an instance of the class is incorrect!");
        } catch (RuntimeException exp) {
            exp.printStackTrace();
        }

        System.out.println("----------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of shapes = ");
        int numberShapes = sc.nextInt();
        try {
            for (int i=0; i<numberShapes; i++) {
                System.out.print("Enter shape: ");
                Shape shape = Shape.parseShape(sc.next());
                shape.draw();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
