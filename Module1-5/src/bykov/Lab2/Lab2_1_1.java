package Lab2;

import bykov.Lab2.Computer;

public class Lab2_1_1 {
    public static void main(String[] args) {
        Computer comp1 = new Computer();
        Computer comp2 = new Computer();

        comp1.setManufacterer(false);
//        comp2.setManufacterer("Microsoft");
        comp1.setSerialNumber(866589036);
        comp2.setSerialNumber(234521123);
        comp1.setPrice(65.770f);
        comp2.setPrice(32.260f);
        comp1.setQuantityCPU(8);
        comp2.setQuantityCPU(4);
        comp1.setFrequencyCPU(3);
        comp2.setFrequencyCPU(2);

        System.out.println("Производитель первого компьютера" +" "+ comp1.getManufacterer());
        System.out.println("Серийный номер первого компьютера" + " "+  comp1.getSerialNumber());
        System.out.println( "Цена первого компьютера" +  " " + comp1.getPrice());
        System.out.println("Количество процессоров первого компьютера" + " " + comp1.getQuantityCPU());
        System.out.println("Частота процессора первого компьютера" + " " + comp1.getFrequencyCPU());
        System.out.println();

        System.out.println("Производитель второго компьютера" +" "+ comp2.getManufacterer());
        System.out.println("Серийный номер второго компьютера" + " "+  comp2.getSerialNumber());
        System.out.println( "Цена второго компьютера" +  " " + comp2.getPrice());
        System.out.println("Количество процессоров второго компьютера" + " " + comp2.getQuantityCPU());
        System.out.println("Частота процессора второго компьютера" + " " + comp2.getFrequencyCPU());


    }
}
