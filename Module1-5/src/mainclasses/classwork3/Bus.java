package mainclasses.classwork3;

import com.brainacad.classesAndInstances.Additional_Practice_Works.AWP3.Person;

public class Bus {

    private int seats = 15;
    private Person driver;

    public void setSeats(int seats) {
        this.seats = seats;
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
