package mainclasses.classwork3;

public class Car {
    private  int maxSpeed;
    private  int milage;

    public Car(int maxSpeed, int milage) {
        System.out.println("Start");
        this.maxSpeed = maxSpeed;
        this.milage = milage;
    }

    public Car(int maxSpeed) {
        System.out.println();
        this.maxSpeed = maxSpeed;
        this.milage = 1;
    }

    public Car() {
        this(100, 1);
    }
}
