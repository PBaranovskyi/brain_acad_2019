package tereshchenko_roman.staticMethodsAndFields;

public class GravityCalculator {

    public static final double ACC = -9.81;

    public static double calcDist(double time) {
        double x = 0.5 * ACC * time * time + time;
        return x;
    }
}
