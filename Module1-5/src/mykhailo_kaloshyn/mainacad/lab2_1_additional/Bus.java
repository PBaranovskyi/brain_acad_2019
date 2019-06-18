package mykhailo_kaloshyn.mainacad.lab2_1_additional;

public class Bus {

    private int seats = 15;
    private Person driver;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        if (this.driver == null) {
            this.seats--;
        }
        this.driver = driver;
    }
}
