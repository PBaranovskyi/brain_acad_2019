package Tomashchuk_Anna.LabWork_2_5_Initialization_sections.Non_static_initializ_block;

public class Car {
    private static int numOfCars;

//Need to add increment of numOfCars for each constructor.
    public Car(){
        numOfCars++;
    }

    public Car(int maxSpeed){
        numOfCars++;
    }
}
