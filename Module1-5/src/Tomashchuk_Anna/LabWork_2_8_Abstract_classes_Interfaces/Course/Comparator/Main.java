package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.Course.Comparator;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car[] myCars={new Car(190,12), new Car(120,0),
        new Car(130,45), new Car(100,5)};

        Arrays.sort(myCars, new CarMaxSpeedComparator());

        for(Car car: myCars){
            System.out.println(car.toString());
            System.out.println();
        }
    }
}
