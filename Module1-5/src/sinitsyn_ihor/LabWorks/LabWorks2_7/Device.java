package sinitsyn_ihor.LabWorks.LabWorks2_7;

import java.util.Objects;

public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

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
    public String toString() {
        return this.getClass().toString() + ", manufacturer: " + this.getManufacturer() + ", price: " + this.getPrice() +
                ", serial number: " + this.getSerialNumber() + ". ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Float.compare(device.price, price) == 0 &&
                Objects.equals(manufacturer, device.manufacturer) &&
                Objects.equals(serialNumber, device.serialNumber);
    }

    @Override
    public int hashCode() {
        int result = 31 * manufacturer.hashCode();
        result = 31 * result + Float.floatToIntBits(price);
        result = 31 * result + serialNumber.hashCode();
        return result;
    }

}
