package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab275_Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor(4300, 600, "HP", 2076.00f, "1897113008");
        Monitor monitor2 = new Monitor(4300, 600, "HP", 2076.00f, "1897113009");
        EthernetAdapter adapt1 = new EthernetAdapter(400, "19834", "DELL", 129.80f, "373462");
        Device device1 = new Device();

        System.out.println(device1);
        monitor1.showDeviceParam();
        //вариант_1
        System.out.println(monitor1);
        //вариант_2 - это одно и тоже
        //System.out.println(monitor1.toString());
        monitor1.showMonitor();

        System.out.println();

        System.out.println(device1);
        adapt1.showDeviceParam();
        System.out.println(monitor1);
        adapt1.showAdapter();
        System.out.println();

        System.out.println(monitor1.equals(monitor2));

        Device[] arr = {monitor1, monitor2, adapt1};
        // device1.showDeviceParam();
        device1.takeDevice(arr);

        System.out.println(Arrays.toString(arr));


    }

}
