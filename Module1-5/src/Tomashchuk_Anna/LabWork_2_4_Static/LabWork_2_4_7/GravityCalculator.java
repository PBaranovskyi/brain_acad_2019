package Tomashchuk_Anna.LabWork_2_4_Static.LabWork_2_4_7;

public class GravityCalculator {
    private static final double Acceleration = 9.81;
    private static double time;
    private static int initialVelocity ;
    private static int initialPosition;
    private static double distance;


    public static double calcDist(double time, int initialVelocity , int initialPosition ) {
        distance = 0.5 * Acceleration * time * time + initialVelocity * time + initialPosition;
        return distance;
    }

}
