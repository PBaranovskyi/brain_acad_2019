package LabWork_2_1.Add_Work_9;

import Tomashchuk_Anna.LabWork_2_1.Add_Work_3.Person;

public class Bus {
    private int seats=15;
    private Person driver; // add the private field driver with type Person

    // public Method
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public int getSeats() {return this.seats;}

    public void setDriver(Person driver) {
        // Если водитель садится в автобус чтобы количкство мест уменьшалось на 1
        if (this.driver == null) {
            seats--;
        }
        this.driver = driver;
    }
    public Person getDriver() {return this.driver;}
}
