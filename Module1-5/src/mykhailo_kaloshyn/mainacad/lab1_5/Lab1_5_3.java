package mykhailo_kaloshyn.mainacad.lab1_5;

public class Lab1_5_3 {
    public static void main(String[] args) {
        System.out.print("* | ");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + "  ");
        }
        System.out.print('\n' + "-----------------------------" + '\n');
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                int b = i * j;
                if (j < 9) {
                    if (b <= 9) {
                        System.out.print(b + "  ");
                    } else {
                        System.out.print(b + " ");
                    }
                } else {
                    System.out.println(b);
                }
            }
        }
    }
}
