package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.Lab283_Comparable_interface;

import java.util.Comparator;

public class ShapeColorComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2){
        Shape shape1=(Shape) o1;
        Shape shape2=(Shape) o2;
        if(shape1.getShapeCode()>shape2.getShapeCode()) return 1;
        if(shape1.getShapeCode()<shape2.getShapeCode()) return -1;
        return 0;

    }

}
