package Lab2_1;


public class Lab2_1_1 {
    public static void main(String[] args) {
            Computer[] comp = new Computer[5];
            comp[0] = new Computer();
            comp[0].setManufacturer(" Asus");
            comp[0].setSerialNumber(12345678);
            comp[0].setPrice(679.86);
            comp[0].setQuantityCPU(8);
            comp[0].setFrequencyCPU(2);
            comp[1] = new Computer();
            comp[1].setManufacturer(" Acer");
            comp[1].setSerialNumber(66778899);
            comp[1].setPrice(876.86);
            comp[1].setQuantityCPU(4);
            comp[1].setFrequencyCPU(2);
            comp[2] = new Computer();
            comp[2].setManufacturer(" Dell");
            comp[2].setSerialNumber(56473829);
            comp[2].setPrice(1000.86);
            comp[2].setQuantityCPU(8);
            comp[2].setFrequencyCPU(4);
            comp[3] = new Computer();
            comp[3].setManufacturer(" IBM");
            comp[3].setSerialNumber(90786543);
            comp[3].setPrice(1200.86);
            comp[3].setQuantityCPU(8);
            comp[3].setFrequencyCPU(4);
            comp[4] = new Computer();
            comp[4].setManufacturer(" Intel");
            comp[4].setSerialNumber(9067890);
            comp[4].setPrice(800.86);
            comp[4].setQuantityCPU(8);
            comp[4].setFrequencyCPU(4);
            for (int i = 0; i < comp.length; i++) {
                System.out.println("Manufacturer-  " + comp[i].getManufacturer());
                System.out.println("Serial Number- " + comp[i].getSerialNumber());
                System.out.println("Price-  " + comp[i].getPrice());
                System.out.println("QuantityCPU-  " + comp[i].getQuantityCPU());
                System.out.println("FrequencyCPU- " + comp[i].getFrequencyCPU());
                System.out.println();
            }
        }

}
