package anna.LabWork_2_1;

import java.util.Random;

public class LabWork_2_1_5_Var_3 {
    static String[] manufacturers = {"Apple", "Microsoft", "Dell", "Toshiba"};

    // (Computer computer, int i) другой вид записи
// отдельно вынесли методы main , printComputers, generateComputers, String generateManufacturer
    public static void main(String[] args) {
        Computer[] compArr = new Computer[10];
        for (int i = 0; i < compArr.length; i++) {
            generateComputers(compArr, i);
//            printComputers(compArr[i], i);
            compArr[i].view();
        }
    }

    private static void printComputers(Computer computer, int i) {
        System.out.println("For " + (i + 1) + " computer:");
        System.out.print("The manufacturer: " + computer.getManufacturer());
        System.out.print(". Serial number: " + computer.getSerialNumber());
        System.out.print(". Quantity of CPU: " + computer.getQuantityCPU());
        System.out.print(". CPU frequency: " + computer.getFrequencyCPU());
        System.out.println(". Actual price: " + String.format("%.2f", computer.getPrice()));
        System.out.print(". Old price: " + String.format("%.2f", computer.getPrice()));
        System.out.println(". Actual price (+10%): " + String.format("%.2f", computer.getPrice() * 1.1));
    }

    private static void generateComputers(Computer[] compArr, int i) {
        compArr[i] = new Computer();
        Random myRand = new Random();
        compArr[i].setManufacturer(generateManufacturer(myRand));
        compArr[i].setSerialNumber(myRand.nextInt(100) + 1);
        compArr[i].setQuantityCPU(myRand.nextInt(7) + 1);
        compArr[i].setFrequencyCPU(myRand.nextInt(3400) + 1000);
        compArr[i].setPrice(myRand.nextFloat() * 100 + 20);
    }

    private static String generateManufacturer(Random myRand) {
        int manuID = myRand.nextInt(manufacturers.length);
        return manufacturers[manuID];
    }
}
