package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab271;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    //Add getters/setters
    public int getResolutionX(){return resolutionX;}
    public int getResolutionY(){return resolutionY;}
    public void setResolutionX(int resolutionX){this.resolutionX=resolutionX;}
    public void setResolutionY(int resolutionY){this.resolutionY=resolutionY;}


    //Add constructor
    Monitor(String manufacturer, float price, String serialNumber, int resX, int resY ) {
        super(manufacturer,price,serialNumber);
        resolutionX = resX;
        resolutionY = resY;
    }

    public void showMonitor() {
        System.out.println("Monitor " + resolutionX + " " + resolutionY);
    }

}
