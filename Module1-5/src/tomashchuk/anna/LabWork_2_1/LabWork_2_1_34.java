package anna.LabWork_2_1;

public class LabWork_2_1_34 {
    public static void main(String[] args) {
        Computer[] arr = new Computer[6];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = new Computer();
            arr[i].setSerialNumber(2);
            arr[i].setQuantityCPU(4);
            arr[i].setFrequencyCPU(300);
            arr[i].setPrice(200);
            System.out.print(" Manufacturer: Asus");
            System.out.print(", Serial number: " + arr[i].getSerialNumber()+i);
            System.out.print(", Quantity CPU: " + arr[i].getQuantityCPU()+i);
            System.out.print(", Frequency CPU : " + (arr[i].getFrequencyCPU()+i*10));
            System.out.println(", Price : " + arr[i].getPrice()*i);
        }
    }
}
