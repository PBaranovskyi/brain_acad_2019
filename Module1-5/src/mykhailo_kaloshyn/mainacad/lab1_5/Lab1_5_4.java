package mykhailo_kaloshyn.mainacad.lab1_5;

public class Lab1_5_4 {
    public static void main(String[] args) {
        int j = 1, i = 1;
        while (i <= 300) {
            if (j > 10) {
                break;
            }
            int a = i % 3, b = i % 4;
            if ((a == 0) || (b == 0)) {
                System.out.println(i);
                j++;
            }
            i++;
        }
    }
}
