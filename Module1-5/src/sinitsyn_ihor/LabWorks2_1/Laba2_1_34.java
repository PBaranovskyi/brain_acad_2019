package sinitsyn_ihor.LabWorks2_1;

import java.sql.SQLOutput;
import java.util.Random;

public class Laba2_1_34 {
    public static void main(String[] args) {
        Computer[] compArr = new Computer[5];
        for (int i = 0; i < compArr.length; i++) {
            compArr[i] = new Computer();
            Random myRand = new Random();
            compArr[i].setManufacturer(myRand.nextBoolean());
            compArr[i].setSerialNumber(myRand.nextInt(100)+1);
            compArr[i].setQuantityCPU(myRand.nextInt(7)+1);
            compArr[i].setFrequencyCPU(myRand.nextInt(3400)+1000);
            compArr[i].setPrice(myRand.nextFloat()*100+20);
            System.out.println("For " + (i+1) + " computer:");
            System.out.print("The manufacturer: " + compArr[i].getManufacturer());
            System.out.print(". Serial number: " + compArr[i].getSerialNumber());
            System.out.print(". Quantity of CPU: " + compArr[i].getQuantityCPU());
            System.out.print(". CPU frequency: " + compArr[i].getFrequencyCPU());
//            System.out.println(". Actual price: " + String.format("%.2f", compArr[i].getPrice()));
            System.out.print(". Old price: " + String.format("%.2f", compArr[i].getPrice()));
            System.out.println(". Actual price (+10%): " + String.format("%.2f", compArr[i].getPrice()*1.1));
        }
    }
}
