package tereshchenko_roman.inheritanceAndPolymorphism.MyShapes.com.brainacad.oop.testshapes;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

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

        System.out.println();

        Rectangle compRect1 = new Rectangle(5);
        Rectangle compRect2 = new Rectangle(12);
        Rectangle compRect3 = new Rectangle(546);
        Rectangle compRect4 = new Rectangle(100);
        Rectangle compRect5 = new Rectangle(15);
        Rectangle compRect6 = new Rectangle(50000);

        Rectangle[] comparatorRectangles = {compRect1, compRect2, compRect3, compRect4, compRect5, compRect6};

        Arrays.sort(comparatorRectangles);
        for (Rectangle comparatorRectangle : comparatorRectangles) {
            System.out.println(comparatorRectangle.getShapeCode());
        }
    }
}

