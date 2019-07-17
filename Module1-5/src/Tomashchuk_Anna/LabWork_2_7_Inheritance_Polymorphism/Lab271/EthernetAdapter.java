package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab271;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    //Add getters/setters
    public int getSpeed(){return speed;}
    public String getMac(){return mac;}
    public void setSpeed(int speed){this.speed=speed;}
    public void setMac(String mac){this.mac=mac;}


    //Add constructor
    EthernetAdapter(String manufacturer, float price, String serialNumber, int speed1, String mac1) {
        super(manufacturer,price,serialNumber);
        speed = speed1;
        mac = mac1;
    }

    public void showAdapter() {
        System.out.println("Adapter " + speed + " " + mac);
    }

}

