package Tomashchuk_Anna.LabWork_2_3.Car_this;

public class Car {
    private int maxSpeed, milage;
    public Car(){
        this(100,1);
        System.out.println("Test Car");
    }
    public Car(int maxSpeed){
        this(maxSpeed,1);
        System.out.println("Test Car(int)");
    }
    public Car(int maxSpeed, int milage) {
        this.maxSpeed=maxSpeed;
        this.milage=milage;
    }
}
