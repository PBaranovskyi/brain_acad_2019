package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.Course.CompareTo_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car[] myCars = {new Car(190), new Car(120), new Car(130),
                new Car(100), new Car(110)};

        Arrays.sort(myCars);
        for (Car car : myCars) {
            System.out.println(car);
        }
    }
}
