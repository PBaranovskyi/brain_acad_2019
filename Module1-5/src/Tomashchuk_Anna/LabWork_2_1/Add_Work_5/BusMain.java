package Tomashchuk_Anna.LabWork_2_1.Add_Work_5;

public class BusMain {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        // Bus bus2=new Bus();
        Bus bus2 = bus1;

        bus1.setSeats(15);
        bus2.setSeats(5);

        System.out.println("bus1: " + bus1.getSeats());
        System.out.println("bus2: " + bus2.getSeats());

    }
}
