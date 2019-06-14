package sinitsyn_ihor.Works.additional_practice;

public class Bus {
    private int seats;
    private Person driver = new Person();

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return this.seats;
    }
}