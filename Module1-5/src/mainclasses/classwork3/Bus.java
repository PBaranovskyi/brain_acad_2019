package mainclasses.classwork3;


import tereshchenko_roman.classesAndInstances.Additional_Practice_Works.AWP3.Person;

public class Bus {

    private static int seats = 15;
    private Person driver;

    public static void setSeats(int seatsT) {
        seats = seatsT;
    }

    public int getSeats() {
        return seats;
    }

    public void setDriver(Person driver) {
        if (this.driver == null) {
            seats--;
        }
        this.driver = driver;
    }

    public Person getDriver() {
        return driver;
    }


}
