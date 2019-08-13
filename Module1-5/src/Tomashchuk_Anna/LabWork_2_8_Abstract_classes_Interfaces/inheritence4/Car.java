package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.inheritence4;

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
