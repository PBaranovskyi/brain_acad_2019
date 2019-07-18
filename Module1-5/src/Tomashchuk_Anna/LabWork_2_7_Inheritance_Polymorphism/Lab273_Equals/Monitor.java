package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab273_Equals;

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

    @Override
    public boolean equals(Object obj){
        if(!this.getClass().toString().equals(obj.getClass().toString())){
            return false;
        }
        Monitor second=(Monitor) obj;
        return this.manufacturer.equals(second.manufacturer) &&
                this.resolutionX==second.resolutionX && this.resolutionY==second.resolutionY &&
                this.price==second.price;

    }


}
