package LabWork_1_5;

public class LabWork_1_5_4 {
    public static void main(String[] args) {
        for (int i = 1; i < 300; i++) {
            if (i % 3 == 0 || i % 4 == 0) // It is divisible by 3 or 4
                System.out.println(i);
            if (i >= 20) {
                break;
            }
        }
    }

}
