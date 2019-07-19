package mykhailo_kaloshyn.mainacad.lab2_7;

public class EthernetAdapter extends Device {

    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return this.getClass().toString() + ": manufacturer = " + this.getManufacturer() +
                ", price = " + this.getPrice() + ", serialNumber = " + this.getSerialNumber() +
                ", speed = " + this.getSpeed() + ", mac = " + this.getMac();
    }
}
