package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab271;

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

    public void showDeviceParam(){
        System.out.println("manufacturer: "+manufacturer+" price: "+ price+" serialNumber: "+ serialNumber);
    }

}
