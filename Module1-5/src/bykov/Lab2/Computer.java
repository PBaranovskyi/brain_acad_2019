package bykov.Lab2;

public class Computer {
    private String manufacterer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;



    public String getManufacterer() {
        return manufacterer;
    }
    public void setManufacterer (boolean manufacturer) {
        if (manufacturer == true) {
            this.manufacterer = "Apple";
        } else {
            this.manufacterer = "Microsoft";
        }
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }
}
