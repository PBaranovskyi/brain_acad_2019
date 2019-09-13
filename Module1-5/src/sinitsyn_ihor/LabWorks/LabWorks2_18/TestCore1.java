package sinitsyn_ihor.LabWorks.LabWorks2_18;

import java.math.BigInteger;

public class TestCore1 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 40) + 10;
        System.out.println("Your result: " + x + "!=" + factorial(x));
    }

    public static BigInteger factorial(int x) {
        BigInteger y = BigInteger.valueOf(x);
        for (long t = 1; t < x; t++) {
            y = y.multiply(BigInteger.valueOf(t));
        }
        return y;
    }
}
