package mainclasses.generics2;

import mainclasses.inheritence4.Car;
import tereshchenko_roman.classesAndInstances.Additional_Practice_Works.AWP3.Person;

public class CarWithDriver extends Car {

    private Person driver;

    public CarWithDriver() {
        super(200);
    }

    public CarWithDriver(int maxSpeed) {
        super(maxSpeed);
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public Person getDriver() {
        return driver;
    }
}
