package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab272;

public class Monitor extends Device {
    public int resolutionX;
    public int resolutionY;

    @Override
    public String toString() {
        return "Monitor: ";
    }

    //Add constructor
    Monitor(int resX, int resY, String manufacturer, float price, String serialNumber) {
        resolutionX = resX;
        resolutionY = resY;

        setManufacturer(manufacturer);
        setPrice(price);
        setSerialNumber(serialNumber);
    }


    public void showMonitor() {
        System.out.println("resolutionX=" + resolutionX + ", resolutionY=" + resolutionY);
    }

}
