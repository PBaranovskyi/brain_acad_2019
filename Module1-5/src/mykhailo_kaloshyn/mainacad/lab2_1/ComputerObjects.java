package mykhailo_kaloshyn.mainacad.lab2_1;

public class ComputerObjects {
    public static void main(String[] args) {
        Computer[] arrComputers = new Computer[5];
        for (int i = 0; i < 5; i++) {
            arrComputers[i] = new Computer();
            arrComputers[i].setPrice((i + 1) * 100);
        }

        for (int j = 0; j < 5; j++) {
            arrComputers[j].setPrice((arrComputers[j].getPrice()) * 1.1f);
            System.out.println("Incresed by 10% price for Computer number " + (j + 1) + " is: " + arrComputers[j].getPrice());
        }
    }
}
