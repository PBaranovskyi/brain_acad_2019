package bilan_max.InheritanceAndPolymorfysm.Zoo.Lab2_7_2;

public class TestDevice {
    public static void main(String[] args) {
        Device[] devices = new Device[4];
        //Monitor[] monitors = new Monitor[2];
        devices[0] = new Device("Asus", 235.56, "3476AB");
        devices[1] = new Device("Samsung", 123.56, "56748AB");
        devices[2] = new Monitor("Samsung", 230, "AB34567BC", 1028, 1040);
        devices[3] = new Monitor("Samsung", 230, "AB34567BC", 1028, 1040);
        for (int i = 0; i < devices.length; i++) {
            System.out.println(devices[i]);
            //Device device1 = new Device("Asus", 235.56, "3476AB");
            //System.out.println(device1);
            //Monitor monitor1 = new Monitor("Samsung",230 ,"AB34567BC",1028,1040);
            // System.out.println(monitor1);
            // EthernetAdapter ethernetAdapter1 = new EthernetAdapter(56789);
            //System.out.println(ethernetAdapter1);
        }
        System.out.println(devices[2].equals(devices[3]));
        System.out.println(devices[1].equals(devices[0]));
    }
}

