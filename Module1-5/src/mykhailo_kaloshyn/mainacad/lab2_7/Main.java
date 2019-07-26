package mykhailo_kaloshyn.mainacad.lab2_7;

public class Main {

    public static void main(String[] args) {

        Device device1 = new Device("Samsung", 120, "AB14570911");
        Device device2 = new Device("Samsung", 120, "AB14570911");

        Monitor monitor1 = new Monitor("Samsung", 100, "AB19202020", 1280, 1024);
        Monitor monitor2 = new Monitor("Dell", 140, "AB19212024", 1340, 1100);
        Monitor monitor3 = new Monitor("Samsung", 120, "AB19202222", 1280, 1024);

        EthernetAdapter ethernetAdapter1 = new EthernetAdapter("HP", 210, "GR1450PK", 45, "L4012");
        EthernetAdapter ethernetAdapter2 = new EthernetAdapter("HP", 210, "GR1450PK", 60, "L7070");

        Device[] arrOfDevices = new Device[] {device1, device2, monitor1, monitor2, monitor3, ethernetAdapter1, ethernetAdapter2};

        System.out.println(ethernetAdapter1.equals(ethernetAdapter2));
        System.out.println(ethernetAdapter1.hashCode());
        System.out.println(ethernetAdapter2.hashCode());
        System.out.println(ethernetAdapter1);
        System.out.println(ethernetAdapter2);

    }
}
