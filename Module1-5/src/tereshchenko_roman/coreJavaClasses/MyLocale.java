package tereshchenko_roman.coreJavaClasses;

import java.text.NumberFormat;
import java.util.Locale;

public class MyLocale {

    public static void main(String[] args) {

        Locale l = Locale.getDefault();

        System.out.println(l.getLanguage());
        System.out.println(l.getCountry());
        System.out.println(l.getDisplayName());

        NumberFormat instance = NumberFormat.getNumberInstance();

        System.out.println(instance.getCurrency());
        System.out.println(instance.getRoundingMode());

        Locale l1 = new Locale("FR");

        System.out.println(l1.getDisplayName());
        System.out.println(l1.getLanguage());

    }
}
