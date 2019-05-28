package mykhailo_kaloshyn.mainacad.lab1_5;

public class Lab1_5_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            for (int j = i; j >= 1; j--) {
                if (j > 1) {
                    System.out.print(j + " ");
                } else {
                    System.out.println(j);
                }
            }
        }
    }
}