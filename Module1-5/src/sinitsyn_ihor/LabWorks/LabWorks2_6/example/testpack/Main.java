package sinitsyn_ihor.LabWorks.LabWorks2_6.example.testpack;

import sinitsyn_ihor.LabWorks.LabWorks2_6.com.brainacad.carpack.Car;
import sinitsyn_ihor.LabWorks.LabWorks2_6.example.applepack.Apple;

public class Main {
    public static void main(String[] args) {
        Car newCar = new Car();
        System.out.println("Weight of car is " + newCar.getMass() + " kg");
        Apple newApple = new Apple();
        System.out.println("Weight of apple is " + newApple.getMass() + " kg");
    }
}
