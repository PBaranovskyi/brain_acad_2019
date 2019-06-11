package Main;

public class Lab1_6_2 {
    public static void main(String[] args) {
        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int max = m[0];
        int min = m[0];
        double average = 0;
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] > max) {
                max = m[i];
            }
            if (m[i] < min) {
                min = m[i];
            }
            sum += m[i];
            average = sum / m.length;
        }
        System.out.println("Минимальное значение" + min + "Максимальное значение " + max + " Среднеарифмитичекое значение " + average);
    }
}
