package sinitsyn_ihor.LabWorks1_5;

public class Laba1_5_4 {
    public static void main(String[] args) {
        int numbersOfAttempt = 0;
        for (int i = 1; i < 300; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.println(i);
                numbersOfAttempt++;
                if (numbersOfAttempt == 10) {
                    break;
                }
            }
        }
    }
}
