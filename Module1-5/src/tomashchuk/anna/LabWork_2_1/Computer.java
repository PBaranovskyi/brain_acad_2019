package anna.LabWork_2_1;

public class Computer {
    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public void setManufacturer(String manufacturer) { this.manufacturer=manufacturer; }
    public String getManufacturer() {return manufacturer;}

    public void setSerialNumber(int serialNumber){this.serialNumber=serialNumber;}
    public int getSerialNumber() {return serialNumber;}

    public void setPrice(float price){this.price=price;}
    public float getPrice() {return price;}

    public void setQuantityCPU(int quantityCPU) {this.quantityCPU=quantityCPU;}
    public int getQuantityCPU() {return quantityCPU;}

    public void setFrequencyCPU(int frequencyCPU) {this.frequencyCPU=frequencyCPU;}
    public int getFrequencyCPU() {return frequencyCPU;}
}
