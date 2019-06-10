package sinitsyn_ihor.LabWorks2_1;

public class Computer {
    private String manufacturer;
    private int serialNumber;
    private int quantityCPU;
    private int frequencyCPU;
    private float price;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(boolean manufacturer) {
        if (manufacturer == true) {
            this.manufacturer = "Apple";
        } else {
            this.manufacturer = "Microsoft";
        }
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void view() {
        System.out.println("The manufacturer: " + this.getManufacturer() + ". Serial number: " + this.getSerialNumber() + ". Quantity of CPU: " + this.getQuantityCPU() + ". CPU frequency: " + this.getFrequencyCPU() + ". Old price: " + String.format("%.2f", this.getPrice()) + ". Actual price (+10%): " + String.format("%.2f", this.getPrice() * 1.1));
    }
}
