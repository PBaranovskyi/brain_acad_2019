package tereshchenko_roman.staticMethodsAndFields;

public class MyCalc {

    static {
        System.out.println("Start MyCalc");
    }

    private static double Pi;

    public static double calcPi(int n) {

        Pi = 4.0;
        int v = 0;
        for (int i = 0; i <= n; i++) {
            Pi = Pi - 4.00 / (3 + v) + 4.00 / (5 + v);
            v = v + 4;
        }
        return Pi;
    }
}