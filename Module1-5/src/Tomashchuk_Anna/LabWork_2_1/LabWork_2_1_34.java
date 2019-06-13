package LabWork_2_1;

import java.util.Random;

public class LabWork_2_1_34 {
    static String[] manufacturers = {"Apple", "Microsoft", "Dell", "Toshiba"};

    public static void main(String[] args) {
        Computer[] arr = new Computer[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Computer();
            Random myRand = new Random();
            arr[i].setManufacturer(generateManufacturer(myRand));
            arr[i].setSerialNumber(2 + i);
            arr[i].setQuantityCPU(4 * i);
            arr[i].setFrequencyCPU(300 + 30 * i);
            arr[i].setPrice(200 + i * 10);
            //System.out.print(" Manufacturer: Asus");
            System.out.print(" Manufacturer: " + arr[i].getManufacturer());
            System.out.print(", Serial number: " + arr[i].getSerialNumber());
            System.out.print(", Quantity CPU: " + arr[i].getQuantityCPU());
            System.out.print(", Frequency CPU : " + (arr[i].getFrequencyCPU()));
            System.out.println(", Price : " + arr[i].getPrice());
        }
    }

    private static String generateManufacturer(Random myRand) {
        int manuID = myRand.nextInt(manufacturers.length);
        return manufacturers[manuID];
    }

}
