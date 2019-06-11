package Lab2;

import java.util.Random;

public class Lab2_1_2 {
    public static void main(String[] args) {
        Computer[] CompArr = new Computer[5];
        for (int i=0; i < CompArr.length; i++) {
            CompArr[i] = new Computer();
            Random CompRandom = new Random();
            CompArr[i]. setManufacterer(CompRandom.nextBoolean());
            CompArr[i].setSerialNumber(CompRandom.nextInt(247654734) + 1);
            CompArr[i].setQuantityCPU(CompRandom.nextInt(4) + 1);
           CompArr[i].setFrequencyCPU(CompRandom.nextInt(5700) + 3000);
            CompArr[i].setPrice(CompRandom.nextFloat() * 50 + 75);
            System.out.println("For " + (i + 1) + " computer:");
                        System.out.print("The manufacturer: " + CompArr[i].getManufacterer());
            System.out.print(". Serial number: " + CompArr[i].getSerialNumber());
            System.out.print(". Quantity of CPU: " + CompArr[i].getQuantityCPU());
            System.out.print(". CPU frequency: " + CompArr[i].getFrequencyCPU());
            System.out.println(". Actual price: " + String.format("%.2f", CompArr[i].getPrice()));
            System.out.print(". Old price: " + String.format("%.2f", CompArr[i].getPrice()));
            System.out.println(". Actual price (+10%): " + String.format("%.2f", CompArr[i].getPrice()*1.1));



        }
    }


}
