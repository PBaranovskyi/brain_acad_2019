package mainclasses.inheritence4;

public class Car implements Comparable {

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
}
