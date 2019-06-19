package sinitsyn_ihor.LabWorks.LabWorks2_1;

public class Computer {
    private String manufacturer;
    private int serialNumber;
    private int quantityCPU;
    private int frequencyCPU;
    private float price;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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
        System.out.println("The manufacturer: " + getManufacturer() + ". Serial number: " + getSerialNumber() + ". Quantity of CPU: " + this.getQuantityCPU() + ". CPU frequency: " + this.getFrequencyCPU() + ". Old price: " + String.format("%.2f", this.getPrice()) + ". Actual price (+10%): " + String.format("%.2f", this.getPrice() * 1.1));
    }

}
