package bilan_max.InheritanceAndPolymorfysm.Zoo.Lab2_7_2;

import java.util.Objects;

public class Device {
    protected String manufacturer;
    protected double price;
    protected String serialNumber;

    public Device() {

    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumbere() {
        return serialNumber;
    }

    public Device(String manufacturer, double price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;
        Device device = (Device) o;
        return Double.compare(device.getPrice(), getPrice()) == 0 &&
                Objects.equals(getManufacturer(), device.getManufacturer()) &&
                Objects.equals(serialNumber, device.serialNumber);
    }

       public String toString() {
        return"Device:" +manufacturer+" price:" +price+ " serialNumber:"+serialNumber;
    }
}
    class Monitor extends Device {
        private int resolutionX;
        private int resolutionY;

        public int getResolutionX() {
            return resolutionX;
        }

        public void setResolutionX(int resolutionX) {
            this.resolutionX = resolutionX;
        }

        public int getResolutionY() {
            return resolutionY;
        }

        public void setResolutionY(int resolutionY) {
            this.resolutionY = resolutionY;
        }

        Monitor(String manufacturer, double price, String serialNumber,int resolutionX, int resolutionY) {
            this.manufacturer=manufacturer;
            this.price=price;
            this.serialNumber=serialNumber;
            this.resolutionX = resolutionX;
            this.resolutionY = resolutionY;
        }

        @Override
        public  String toString() {
            return"Monitor:"+ manufacturer+"  price:"+price+" serialNumber:"+serialNumber+" resolutionX:"+resolutionX+" resolutionY:"+resolutionY;
        }
    }

    class EthernetAdapter extends Device {
        private int speed;

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        EthernetAdapter(int speed) {
            this.speed = speed;
        }
    }

