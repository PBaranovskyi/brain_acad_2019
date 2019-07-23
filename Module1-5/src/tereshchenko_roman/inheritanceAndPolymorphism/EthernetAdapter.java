package tereshchenko_roman.inheritanceAndPolymorphism;

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
        return "Device: " + "manufacturer =" + getManufacturer() + ", price = " + getPrice() + ", serialNumber = " + getSerialNumber() + ", speed = " + getSpeed() + ", mac = " + getMac();
    }

    @Override
    public boolean equals(Object o) {
        if (this.getSerialNumber() == super.getSerialNumber()) return true;
        return false;
    }

    @Override
    public int hashCode() {
        int result = 256;
        result = result * speed;
        return result;
    }
}
