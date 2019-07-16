package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab275_Array;

public class Device {
    public String manufacturer;
    public float price;
    private String serialNumber;
    private Device[] listOfDevices;

    @Override
    public String toString(){
        return "Device: ";
    }


    //Add getters/setters
    public String getManufacturer(){return manufacturer;}
    public float getPrice(){return price;}
    public String getSerialNumber(){return serialNumber;}

    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
    public void setPrice(float price){this.price=price;}
    public void setSerialNumber(String serialNumber){this.serialNumber=serialNumber;}

    public void showDeviceParam(){
        System.out.println("manufacturer="+manufacturer+", price="+ price+", serialNumber="+ serialNumber);
    }

    public Device[] getListOfDevices() {
        return listOfDevices;
    }

    public void takeDevice(Device[] someDevices) {
        this.listOfDevices= someDevices;

        for (Device device : this.listOfDevices) {
            System.out.print("[" + device.getManufacturer()+ "] ");
        }
    }

}
