package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab275_Array;

public class Device {
    // protected для метода equals в классе Monitor, когда было private не отображалось
    protected String manufacturer;
    protected float price;
    protected String serialNumber;
    protected Device[] listOfDevices;

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

    @Override //Overriding toString() method
    public String toString() {
        return "Device: manufacturer= " + this.getManufacturer() +
                ", price=" + this.getPrice() + ", serialNumber= " + this.getSerialNumber();
    }


    @Override // Overriding equals() method
    public boolean equals(Object obj){
        if(!this.getClass().toString().equals(obj.getClass().toString())){
            return false;
        }
        Device secondDevice=(Device) obj;
        return this.manufacturer.equals(secondDevice.manufacturer)&&
                this.price==secondDevice.price;
    }


    public Device[] getListOfDevices(){
        return listOfDevices;
    }

    public void takeDevice(Device[] someDevices){
        this.listOfDevices=someDevices;
        for(Device device: this.listOfDevices){
            System.out.println("[ Device Manufact= "+device.getManufacturer()+ ", Price=" +device.getPrice()+", SN " + device.getSerialNumber()+"]");
        }
    }

}
