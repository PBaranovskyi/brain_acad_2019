package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab271;

public class Monitor extends Device {
    public int resolutionX;
    public int resolutionY;

    //Add constructor

    Monitor(int resX, int resY, String manufacturer, float price, String serialNumber) {
        setManufacturer(manufacturer);
        setPrice(price);
        setSerialNumber(serialNumber);

        resolutionX = resX;
        resolutionY = resY;
    }

}
