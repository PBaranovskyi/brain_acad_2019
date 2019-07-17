package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab272_New;

public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    //Add getters/setters
    public String getManufacturer(){return manufacturer;}
    public float getPrice(){return price;}
    public String getSerialNumber(){return serialNumber;}

    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
    public void setPrice(float price){this.price=price;}
    public void setSerialNumber(String serialNumber){this.serialNumber=serialNumber;}

    //Add constructor
    public Device(String manufacturer, float price, String serialNumber){
        setManufacturer(manufacturer);
        setPrice(price);
        setSerialNumber(serialNumber);
    }

    @Override
    public String toString(){
        return "Device: manufacturer= "+this.getManufacturer()+
                ", price=" +this.getPrice()+", serialNumber= "+this.getSerialNumber();
    }

}
