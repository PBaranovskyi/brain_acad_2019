package mainclasses.inheritence4;

public class Car {

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
}
