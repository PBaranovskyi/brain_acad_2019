package LabWork_2_1.Add_Work_9;

import Tomashchuk_Anna.LabWork_2_1.Add_Work_3.Person;

public class Bus {
    private int seats=15;
    private Person driver;

    // public Method
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public int getSeats() {return this.seats;}

    public void setDriver(Person driver) {
        if (this.driver == null) {
            seats--;
        }
        this.driver = driver;
    }
    public Person getDriver() {return this.driver;}
}
