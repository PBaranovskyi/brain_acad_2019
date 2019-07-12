package bilan_max.InheritanceAndPolymorfysm.Zoo.Lab2_7_2;

public class TestDevice {
    public static void main(String[] args) {
        Device device1 = new Device("Asus", 235.56, "3476AB");
        System.out.println(device1);
        Monitor monitor1 = new Monitor("Samsung",230 ,"AB34567BC",1028,1040);
        System.out.println(monitor1);
       // EthernetAdapter ethernetAdapter1 = new EthernetAdapter(56789);
        //System.out.println(ethernetAdapter1);
    }
}

