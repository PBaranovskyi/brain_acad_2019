package tereshchenko_roman.coreJavaClasses;


import java.math.BigDecimal;

public class BigDec {

    public static void main(String[] args) {

        final BigDecimal bd1 = new BigDecimal("0.1");
        final BigDecimal bd2 = new BigDecimal("1.1");

        for (BigDecimal x = bd1; x.compareTo(bd2) < 0; x = x.add(bd1)) {
            System.out.println(x);
        }
    }
}
