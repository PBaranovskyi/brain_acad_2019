package Tomashchuk_Anna.Lab_2_18_Core_Java_Classes;

import java.math.BigDecimal;

public class BigDecim {
    public static void main(String[] args) {
        final BigDecimal zd1=new BigDecimal("0.1");
        final BigDecimal zd2=new BigDecimal("1.1");
        for(BigDecimal x=zd1;
            x.compareTo(zd2)<0;
            x=x.add(zd1)){
            System.out.println(x);
        }
    }
}
