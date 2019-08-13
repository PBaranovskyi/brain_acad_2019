package tereshchenko_roman.inheritanceAndPolymorphism.MyShapes.com.brainacad.oop.testshapes;

import java.util.Comparator;

public class ShapeCodeComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Shape shape1 = (Shape) o1;
        Shape shape2 = (Shape) o2;
        if (shape1.getShapeCode()>shape2.getShapeCode()) return 1;
        if (shape1.getShapeCode()<shape2.getShapeCode()) return 1;
        return 0;
    }

//    @Override
//    public String toString() {
//        return "This is rectangle with code number" + getShapeCode();
//    }
}
