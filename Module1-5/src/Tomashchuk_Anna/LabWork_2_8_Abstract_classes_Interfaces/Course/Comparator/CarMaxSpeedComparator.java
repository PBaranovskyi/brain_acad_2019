package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.Course.Comparator;

import java.util.Comparator;

public class CarMaxSpeedComparator implements Comparator {
    // Comparator содержит метод compare и принимает 2 объекта
    @Override
    public int compare(Object o1, Object o2){
        Car car1=(Car) o1;
        Car car2=(Car) o2;
        if(car1.getMaxSpeed()>car2.getMaxSpeed()) return 1;
        if(car1.getMaxSpeed()<car2.getMaxSpeed()) return -1;
        return  0;

    }
}
