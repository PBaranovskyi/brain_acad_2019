package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab271;

public class Main {
    public static void main(String[] args) {
        Monitor monitor1=new Monitor("HP",2076.00f,"1897113008",4300,600);
        EthernetAdapter adapt1 = new EthernetAdapter("DELL", 129.80f, "373462",400, "19834");

        monitor1.showDeviceParam();
        monitor1.showMonitor();

        System.out.println();

        adapt1.showDeviceParam();
        adapt1.showAdapter();

    }

}
