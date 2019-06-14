package LabWork_2_1;

import java.util.Random;

public class LabWork_2_1_5_Var_2 {
    static String[] manufacturers = {"Apple", "Microsoft", "Dell", "Toshiba"};

    // Добавили Random  в остальные сеттеры
    public static void main(String[] args) {
        Computer[] arr = new Computer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Computer();
            Random myRand = new Random();
            arr[i].setManufacturer(generateManufacturer(myRand));
            arr[i].setSerialNumber(myRand.nextInt(400) + 2);
            arr[i].setQuantityCPU(myRand.nextInt(5) + 3);
            arr[i].setFrequencyCPU(myRand.nextInt(200) + 100);
            arr[i].setPrice(myRand.nextFloat() * 100);

            arr[i].view();
        }
    }

    private static String generateManufacturer(Random myRand) {
        int manuID = myRand.nextInt(manufacturers.length);
        return manufacturers[manuID];
    }

}
