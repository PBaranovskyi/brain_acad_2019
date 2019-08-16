package sinitsyn_ihor.LabWorks.LabWorks2_7.MyShapes;

import java.util.Random;

public class MainArr {
    public static void main(String[] args) {
        String[] colorArr = {"Black", "White", "Green", "Red", "Blue", "Yellow", "Grey", "Brown", "Pink"};
        Shape[] shapeArr = new Shape[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            if (i < 6) {
                shapeArr[i] = new Rectangle(colorArr[rand.nextInt(colorArr.length)], Math.round(rand.nextDouble() * 1000) / 100.0, Math.round(rand.nextDouble() * 1000) / 100.0);
            } else if (i < 8) {
                shapeArr[i] = new Circle(colorArr[rand.nextInt(colorArr.length)], Math.round(rand.nextDouble() * 1000) / 100.0);
            } else {
                shapeArr[i] = new Triangle(colorArr[rand.nextInt(colorArr.length)], Math.round(rand.nextDouble() * 1000) / 100.0, Math.round(rand.nextDouble() * 1000) / 100.0, Math.round(rand.nextDouble() * 1000) / 100.0);
            }
        }
        for (Shape shape : shapeArr) {
            shape.toString();
            shape.calcArea();
        }
    }

}
