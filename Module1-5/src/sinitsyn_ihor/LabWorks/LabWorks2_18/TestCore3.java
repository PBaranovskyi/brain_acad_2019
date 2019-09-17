package sinitsyn_ihor.LabWorks.LabWorks2_18;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class TestCore3 {
    public static void main(String[] args) {
        //Locale curLoc = Locale.getDefault();
        Locale loc1 = new Locale("ua", "UA");
        Locale loc2 = Locale.CHINA;
        Locale loc3 = new Locale("it", "IT");
        sout(loc1);
        sout(loc2);
        sout(loc3);
        Date date = new Date();
        System.out.println("Date: " + date);
    }
    protected static void sout (Object curLoc){
        NumberFormat numb = NumberFormat.getNumberInstance((Locale) curLoc);
        NumberFormat curNumb = NumberFormat.getCurrencyInstance((Locale) curLoc);
        Currency cur = Currency.getInstance((Locale) curLoc);
        long longVal = 1234567890L;
        double doubleVal = 2.123456789;
        System.out.println("Current locale: " + ((Locale) curLoc).getDisplayName());
        System.out.println("Long value: " + numb.format(longVal));
        System.out.println("Double value: " + numb.format(doubleVal));
        System.out.println("Currency: " + cur.getDisplayName() + " : " + curNumb.format(longVal));
    }
}
