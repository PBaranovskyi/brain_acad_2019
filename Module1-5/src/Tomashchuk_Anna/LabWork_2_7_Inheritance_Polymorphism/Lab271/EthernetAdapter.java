package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab271;

public class EthernetAdapter extends Device {
    public int speed;
    public String mac;

    //Add constructor
    EthernetAdapter(int speed1, String mac1, String manufacturer, float price) {
        speed = speed1;
        mac = mac1;

        setManufacturer(manufacturer);
        setPrice(price);

    }
}
