package Tomashchuk_Anna.LabWork_2_1;

import java.util.Random;

public class LabWork_2_1_5_Var_1_Set_Get {
    static String[] manufacturers = {"Apple", "Microsoft", "Dell", "Toshiba"};

    public static void main(String[] args) {
        Computer[] arr = new Computer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Computer();
            Random myRand = new Random();
            arr[i].setManufacturer(generateManufacturer(myRand));
            arr[i].setSerialNumber(2 + i);
            arr[i].setQuantityCPU(4 * i);
            arr[i].setFrequencyCPU(300 + 30 * i);
            arr[i].setPrice(200 + i * 10);

            arr[i].view();
        }
    }

    private static String generateManufacturer(Random myRand) {
        int manuID = myRand.nextInt(manufacturers.length);
        return manufacturers[manuID];
    }

}
