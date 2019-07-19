package sinitsyn_ihor.LabWorks.LabWorks2_4;

import java.util.Random;
import java.util.Scanner;

public class GravityCalculator {
    private static double distance;
    private static final double ACCEL = -9.81;
    private static int inVel = 0;
    private static int inPos = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Вы хотите самостоятельно задать стартовые параметры? Нажмите 0 если нет, и любую другую цифру если да: ");
        int choos = scan.nextInt();
        if (choos == 0) {
            Random rand = new Random();
            double time = (double) rand.nextDouble() * 100;
            calcDist(time);
            System.out.println("Если взять время " + Math.round(time * 100.0) / 100.0 + " секунды, то дальность падения будет равна " + Math.round(getDistance() * 100.0) / 100.0 + " метров.");
        } else {
            System.out.print("Задайте время падения в секундах: ");
            double time = scan.nextDouble();
            System.out.print("Теперь задайте начальную скорость: ");
            int startVel = scan.nextInt();
            System.out.print("и задайте начальную позицию: ");
            int startPos = scan.nextInt();
            calcDist(time, startVel, startPos);
            System.out.println("Если взять время " + Math.round(time * 100.0) / 100.0 + " секунды, начальную скорость " + startVel + " и стартовую позицию " + startPos + ", то дальность падения будет равна " + Math.round(getDistance() * 100.0) / 100.0 + " метров.");
        }
    }

    public static double calcDist(double time) {
        distance = ACCEL * time * time / 2 + inVel * time + inPos;
        return distance;
    }

    public static double calcDist(double time, int startVel, int startPos) {
        distance = ACCEL * time * time / 2 + inVel * time + inPos;
        return distance;
    }

    public static double getDistance() {
        return distance;
    }
}
