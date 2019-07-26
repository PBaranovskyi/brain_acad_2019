package sinitsyn_ihor.LabWorks.LabWorks2_7;

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
        return this.getClass().toString() + ", manufacturer: " + this.getManufacturer() + ", price: " + this.getPrice() +
                ", serial number: " + this.getSerialNumber() + ", speed: " + this.getSpeed() + ", mac: " + this.getMac();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        EthernetAdapter ethAd = (EthernetAdapter) obj;

        if (getSpeed() != ethAd.getSpeed()) return false;
        if (getMac() != ethAd.getMac()) return false;
        return ethAd != null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getSpeed();
        result = 31 * result + (getMac() != null ? getMac().hashCode() : 0);
        return result;
    }
}
