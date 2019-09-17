package tereshchenko_roman.coreJavaClasses;

import java.math.BigDecimal;
import java.math.MathContext;

public class Main2 {

    public static void main(String[] args) {
        final BigDecimal TenCents = new BigDecimal(0.1);

        int nailsBought = 0;

        BigDecimal funds = new BigDecimal(1.0);
        for (BigDecimal price = TenCents; funds.compareTo(price) == 1; price = price.add(TenCents)) {
            nailsBought++;
            funds = funds.subtract(price);
        }
        System.out.println(nailsBought + " nails bougt");
        System.out.println("Money left: $" + funds);
    }
}
