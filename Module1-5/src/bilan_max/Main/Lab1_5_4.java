package Main;

public class Lab1_5_4 {
    public static void main(String[] args) {
        int countResult = 0;
        for (int x = 1; x <= 300; x++) {
            if (x % 3 == 0 || x % 4 == 0) {
                System.out.println(x);
                countResult++;
                if (countResult == 10) {
                    break;
                }
            }
        }
    }
}

