package mykhailo_kaloshyn.mainacad.lab1_6;

public class Lab1_6_1 {
    public static void main(String[] args) {
        int[] arr = new int[30 / 2];
        int j = 0;
        for (int i = 2; i <= 30; i++) {
            if ((i % 2) == 0) {
                arr[j] = i;
                System.out.println("Element at index [" + j + "]: " + arr[j]);
                j++;
            }
        }
    }
}
