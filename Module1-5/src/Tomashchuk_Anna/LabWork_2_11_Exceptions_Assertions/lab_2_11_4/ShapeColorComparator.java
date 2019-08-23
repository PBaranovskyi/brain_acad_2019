package Tomashchuk_Anna.LabWork_2_11_Exceptions_Assertions.lab_2_11_4;

import java.util.Comparator;

public class ShapeColorComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Shape shape_1 = (Shape)o1;
        Shape shape_2 = (Shape)o2;
        return shape_1.getShapeColor().compareTo(shape_2.getShapeColor());
    }
}
