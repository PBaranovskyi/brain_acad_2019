package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab274_hashCode;

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

    @Override //Overriding toString() method
    public String toString() {
        return "Adapter: manufacturer=" + super.getManufacturer() + ", price=" + super.getPrice() + ", serialNumber=" +
                super.getSerialNumber() + ", speed=" + this.getSpeed() + ", mac=" + this.getMac() + '\n';
    }

    @Override // Overriding equals() method
    public boolean equals(Object obj) {
        if (!this.getClass().toString().equals(obj.getClass().toString())) {
            return false;
        }
        EthernetAdapter secondAdapt = (EthernetAdapter) obj;
        return this.manufacturer.equals(secondAdapt.manufacturer) &&
                this.price == secondAdapt.price && this.speed == secondAdapt.speed;

    }

}

