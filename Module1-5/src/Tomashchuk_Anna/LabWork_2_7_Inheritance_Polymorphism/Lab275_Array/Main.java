package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab275_Array;

import java.util.Arrays;

public class Main {
    // Override equals() method in each class
    public static void main(String[] args) {
        Device device1 = new Device("ASUS", 1750.50f, "50100204");
        Device device2 = new Device("ASUS", 1750.50f, "50100209");
        Device device3 = new Device("ASUS", 4200.00f, "50100209");

        Monitor monitor1 = new Monitor("HP", 2076.00f, "107113008", 4300, 600);
        Monitor monitor2 = new Monitor("HP", 2076.00f, "107113009", 4300, 600);
        Monitor monitor3 = new Monitor("HP", 3800.00f, "107113007", 4300, 600);

        EthernetAdapter adapt1 = new EthernetAdapter("DELL", 129.80f, "310002", 400, "19834");
        EthernetAdapter adapt2 = new EthernetAdapter("DELL", 129.80f, "310003", 400, "19835");
        EthernetAdapter adapt3 = new EthernetAdapter("ASUS", 129.80f, "310004", 400, "19836");

        System.out.println(device1);
        System.out.println(device2);
        System.out.println(device3);
        System.out.println();
        System.out.println(monitor1);
        System.out.println(monitor2);
        System.out.println(monitor3);
        System.out.println();
        System.out.println(adapt1);
        System.out.println(adapt2);
        System.out.println(adapt3);

        System.out.println();
        System.out.print("monitor1.equals(monitor2): ");
        System.out.println(monitor1.equals(monitor2));
        System.out.print("monitor1.equals(monitor3): ");
        System.out.println(monitor1.equals(monitor3));
        System.out.println();

        System.out.print("adapt1.equals(adapt2):");
        System.out.println(adapt1.equals(adapt2));
        System.out.print("adapt1.equals(adapt3):");
        System.out.println(adapt1.equals(adapt3));
        System.out.println();

        System.out.print("device1.equals(device2):");
        System.out.println(device1.equals(device2));
        System.out.print("device1.equals(device3):");
        System.out.println(device1.equals(device3));
        System.out.println();

        Device[] arr = {monitor1, monitor2, adapt1, adapt2};
        device1.takeDevice(arr);
        System.out.println();
        System.out.println(Arrays.toString(arr));

    }

}
