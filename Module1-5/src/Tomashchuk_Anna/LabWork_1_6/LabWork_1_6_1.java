package LabWork_1_6;

public class LabWork_1_6_1 {
    public static void main(String[] args) {
//        for (int i = 2; i <= 30; i += 2) {
//            System.out.println(i);
//        }

        final int MAX_VALUE = 30;
        int counter = 0;
        int[] arr = new int[MAX_VALUE / 2];
        for (int i = 1; i <= MAX_VALUE; i++) {
            if (i % 2 == 0) {
                arr[counter++] = i;
                System.out.println(i);
            }
        }
    }
}

