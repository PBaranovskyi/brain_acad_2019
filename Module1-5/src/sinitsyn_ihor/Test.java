package sinitsyn_ihor;

import java.math.BigDecimal;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
//        BigDecimal dec = new BigDecimal("0.1");
//        BigDecimal dec2 = new BigDecimal("0.1");
//        System.out.println(dec);
//        for (int x = 0; x < 10; x++) {
//            dec = dec.add(dec2);
//            System.out.println(dec);
//        }
//        Map<String, String> getenv = System.getenv();
//        for (String key : getenv.keySet()) {
//            String value = getenv.get(key);
//            System.out.println("Key = " + key + ", value = " + value);
//        }
        calculate(-0.3, 11);
        Integer x = new Integer("0");
        System.out.println(x.MIN_VALUE);
        System.out.println(x.MAX_VALUE);
    }
    public static void calculate(double x, int y) {
        BigDecimal result = BigDecimal.valueOf(x);
        for (int t = 1; t < y; t++) {
            result = result.multiply(BigDecimal.valueOf(x));
        }
        System.out.println("Your result: " + result);
    }
}
