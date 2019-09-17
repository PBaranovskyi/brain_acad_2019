package tereshchenko_roman.coreJavaClasses;


import java.math.BigInteger;
import java.util.Random;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.valueOf;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int number = 10 + random.nextInt(40);
        System.out.println(number + "! = " + factorial(number));

    }

    public static BigInteger factorial (int number) {

        BigInteger result = ONE;
        for (int i = 2; i <= number; i++)
            result = result.multiply(valueOf(i));
        return result;
    }
}
