package sinitsyn_ihor.LabWorks.LabWorks2_7;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return this.getClass().toString() + ", manufacturer: " + this.getManufacturer() + ", price: " + this.getPrice() +
                ", serial number: " + this.getSerialNumber() + ", resolutionX: " + this.getResolutionX() + ", resolutionY: " + this.getResolutionY();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        Monitor monitor = (Monitor) obj;

        if (getResolutionX() != monitor.getResolutionX()) return false;
        if (getResolutionY() != monitor.getResolutionY()) return false;
        return monitor != null;
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + resolutionX;
        result = 31 * result + resolutionY;
        return result;
    }
}
