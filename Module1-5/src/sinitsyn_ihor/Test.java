package sinitsyn_ihor;

import java.math.BigDecimal;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        BigDecimal dec = new BigDecimal("0.1");
        BigDecimal dec2 = new BigDecimal("0.1");
        System.out.println(dec);
        for (int x = 0; x < 10; x++) {
            dec = dec.add(dec2);
            System.out.println(dec);
        }
        Map<String, String> getenv = System.getenv();
        for (String key : getenv.keySet()) {
            String value = getenv.get(key);
            System.out.println("Key = " + key + ", value = " + value);
        }
    }
}
