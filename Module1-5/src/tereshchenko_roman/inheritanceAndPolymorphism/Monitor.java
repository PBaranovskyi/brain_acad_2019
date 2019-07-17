package tereshchenko_roman.inheritanceAndPolymorphism;

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
    public String toString(){
        return "Device: " + "manufacturer =" + getManufacturer() + ", price = " + getPrice() + ", serialNumber = " + getSerialNumber() + ", X = " + getResolutionX() + ", Y = " + getResolutionY();
    }
    public boolean equals (String serialNumber){
        if (this.getSerialNumber() == serialNumber) return true;
        return false;
    }

}
