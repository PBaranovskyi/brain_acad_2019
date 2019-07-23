package sinitsyn_ihor.LabWorks.LabWorks2_7;

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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Device device = (Device) obj;

        if (getManufacturer() != device.getManufacturer()) return false;
        if (getSerialNumber() != device.getSerialNumber()) return false;
        return getManufacturer() != null;
    }

    @Override
    public int hashCode() {
        int result = (int)price;
        result = 31 * result + (int)price;
        return result;
    }

}
