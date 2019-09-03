package mainclasses.inheritence4;

import java.util.Iterator;
import java.util.Random;

public class Car implements Comparable, Iterable<Car> {

    private int maxSpeed;


    public Car(int maxSpeed){
       this.maxSpeed = maxSpeed;
    }

    public Car copyCar(){
        return new Car(maxSpeed);
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int compareTo(Object o) {
        Car objectCompareWith = (Car) o;
        return objectCompareWith.getMaxSpeed() - this.getMaxSpeed();
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public Iterator<Car> iterator() {
        return new Iterator<Car>() {
            @Override
            public boolean hasNext() {
                return new Random().nextBoolean();
            }

            @Override
            public Car next() {
                return new Car(9000);
            }
        };
    }
}
