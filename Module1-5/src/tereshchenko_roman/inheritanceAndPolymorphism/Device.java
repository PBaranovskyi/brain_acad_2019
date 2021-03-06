package tereshchenko_roman.inheritanceAndPolymorphism;

public class Device {

    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device() {

    }
    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString(){
        return "Device: " + "manufacturer = " + getManufacturer() + ", price = " + getPrice() + ", serialNumber = " + getSerialNumber();
    }

    @Override
    public boolean equals (Object o){
        Device device = (Device) o;
        if (this.serialNumber == device.serialNumber) return true;
        return false;
        }

    @Override
    public int hashCode() {
        int result = Float.floatToIntBits(price);
        return result;
    }
}
