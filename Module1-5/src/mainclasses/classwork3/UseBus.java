package mainclasses.classwork3;


import tereshchenko_roman.classesAndInstances.Additional_Practice_Works.AWP3.Person;

public class UseBus {

    public static void main(String[] args) {


        Bus bus = new Bus();

        System.out.println("New bus with: " + bus.getSeats() + " seats");

        bus.setSeats(5);

        System.out.println("New bus with: " + bus.getSeats() + " seats");

        Person driver = new Person("Vasya", 1987);
//        driver.setName("Vasya");

        System.out.println("Seats before : " + bus.getSeats());

        bus.setDriver(driver);

        System.out.println("Seats after : " + bus.getSeats());


        Person driver2 = new Person("Petya", 1991);
//        driver2.setName("Petya");

        bus.setDriver(driver2);

        System.out.println("Seats after2 : " + bus.getSeats());
    }

}
