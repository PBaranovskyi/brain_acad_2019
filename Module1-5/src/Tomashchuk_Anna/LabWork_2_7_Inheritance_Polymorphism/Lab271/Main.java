package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab271;

public class Main {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor(4300, 600, "HP", 2076.00f, "1897113008");
        EthernetAdapter adapt1 = new EthernetAdapter(400, "19834", "DELL", 129.80f);

        monitor1.showDeviceParam();

    }

}
