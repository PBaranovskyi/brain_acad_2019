package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab273_Equals;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    //Add getters/setters
    public int getResolutionX() { return resolutionX; }
    public int getResolutionY() { return resolutionY; }
    public void setResolutionX(int resolutionX) { this.resolutionX = resolutionX; }
    public void setResolutionY(int resolutionY) { this.resolutionY = resolutionY; }


    //Add constructor
    Monitor(String manufacturer, float price, String serialNumber, int resX, int resY) {
        super(manufacturer, price, serialNumber);
        resolutionX = resX;
        resolutionY = resY;
    }


    @Override  //Overriding toString() method
    public String toString() {
        return "Monitor: manufacturer=" + this.getManufacturer() + ", price=" + this.getPrice() + ", serialNumber="
                + this.getSerialNumber() + ", resolutionX=" + this.resolutionX + ", resolutionY=" + this.resolutionY;
    }


    @Override // Overriding equals() method
    // Прописываем логику - Если у monitor1 и monitor2 равны поля manufacturer, price, resolutionX и resolutionY,
    // то , System.out.println(monitor1.equals(monitor2)); выдаст true

    public boolean equals(Object obj) {
        if (!this.getClass().toString().equals(obj.getClass().toString())) {
            return false;
        }
        Monitor second = (Monitor) obj;
        return  // используем equals,так как manufacturer типа String - а это объектный тип
                this.manufacturer.equals(second.manufacturer) &&
                        // Можем записывать через == потому что price типа float - а это примитивный тип
                        this.price == second.price &&
                        this.resolutionX == second.resolutionX && this.resolutionY == second.resolutionY;
    }


}
