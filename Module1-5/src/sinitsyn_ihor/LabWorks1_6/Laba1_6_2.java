package sinitsyn_ihor.LabWorks1_6;

public class Laba1_6_2 {
    public static void main(String[] args) {
        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int sum = 0;
        int maxValue = m[0];
        int minValue = m[0];
        for (int sumElements : m) {
            sum += sumElements;
        }
        for (int iterative = 0; iterative < m.length; iterative++) {
            if (m[iterative] > maxValue) {
                maxValue = m[iterative];
            } else if (m[iterative] < minValue) {
                minValue = m[iterative];
            }
        }
        System.out.println("Maximum value = " + maxValue);
        System.out.println("Minimum value = " + minValue);
        System.out.println("Average value for array = " + sum / (double) m.length);
    }
}
