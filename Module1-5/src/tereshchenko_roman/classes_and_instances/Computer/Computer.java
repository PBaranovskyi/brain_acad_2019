package com.brainacad.classes_and_instances.Computer;

public class Computer {

    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public Computer(String manufacturer, int serialNumber, float price, int quantityCPU, int frequencyCPU) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
        this.quantityCPU = quantityCPU;
        this.frequencyCPU = frequencyCPU;
    }

    public void setManufacturer(String n) {
        manufacturer = n;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setSerialNumber(int a) {
        serialNumber = a;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setPrice(float c) {
        price = c;
    }

    public float getPrice() {
        return price;
    }

    public void setQuantityCPU(int d) {
        quantityCPU = d;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setFrequencyCPU(int e) {
        frequencyCPU = e;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }
    void view (){}
}
