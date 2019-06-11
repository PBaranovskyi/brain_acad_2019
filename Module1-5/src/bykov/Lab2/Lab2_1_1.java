package Lab2;

import bykov.Lab2.Computer;

public class Lab2_1_1 {
    public static void main(String[] args) {
        Computer Comp1 = new Computer();
        Computer Comp2 = new Computer();

//        Comp1.setManufacterer("Apple");
//        Comp2.setManufacterer("Microsoft");
        Comp1.setSerialNumber(866589036);
        Comp2.setSerialNumber(234521123);
        Comp1.setPrice(65.770f);
        Comp2.setPrice(32.260f);
        Comp1.setQuantityCPU(8);
        Comp2.setQuantityCPU(4);
        Comp1.setFrequencyCPU(3);
        Comp2.setFrequencyCPU(2);

        System.out.println("Производитель первого компьютера" +" "+ Comp1.getManufacterer());
        System.out.println("Серийный номер первого компьютера" + " "+  Comp1.getSerialNumber());
        System.out.println( "Цена первого компьютера" +  " " + Comp1.getPrice());
        System.out.println("Количество процессоров первого компьютера" + " " + Comp1.getQuantityCPU());
        System.out.println("Частота процессора первого компьютера" + " " + Comp1.getFrequencyCPU());
        System.out.println();

        System.out.println("Производитель второго компьютера" +" "+ Comp2.getManufacterer());
        System.out.println("Серийный номер второго компьютера" + " "+  Comp2.getSerialNumber());
        System.out.println( "Цена второго компьютера" +  " " + Comp2.getPrice());
        System.out.println("Количество процессоров второго компьютера" + " " + Comp2.getQuantityCPU());
        System.out.println("Частота процессора второго компьютера" + " " + Comp2.getFrequencyCPU());


    }
}
