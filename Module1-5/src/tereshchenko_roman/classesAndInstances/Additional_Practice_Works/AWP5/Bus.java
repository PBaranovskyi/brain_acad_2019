package com.brainacad.classesAndInstances.Additional_Practice_Works.AWP5;

import tereshchenko_roman.classesAndInstances.Additional_Practice_Works.AWP3.Person;

public class Bus {
    private int seats;
    public void setSeats(int seats){
        this.seats=seats;
    }
    public int getSeats(){
        return this.seats;
    }
    public Person driver;

    public void setDriver(Person driver){
        this.driver = driver;
    }

    public Person getDriver(){
        return driver;
    }
}
