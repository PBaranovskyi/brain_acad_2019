package Lab2;

public class Lab2_1_1 {
    public static void main(String[] args) {
        Computer Comp1 = new Computer();
        Computer Comp2 = new Computer();

        Comp1.setManufacterer("Apple");
        Comp2.setManufacterer("Microsoft");
        Comp1.setSerialNumber(866589036);
        Comp2.setSerialNumber(234521123);
        Comp1.setPrice(65.770f);
        Comp2.setPrice(32.260f);
        Comp1.setQuantityCPU(8);
        Comp2.setQuantityCPU(4);
        Comp1.setFrequencyCPU(3);
        Comp2.setFrequencyCPU(2);

        System.out.println("Производитель" + Comp1.getManufacterer() + "Серийный номер" + Comp1.getSerialNumber() + "Цена" +
                Comp1.getPrice() + "Количество процессоров" + Comp1.getQuantityCPU() + "Частота процессора" + Comp1.getFrequencyCPU());
    }
}
