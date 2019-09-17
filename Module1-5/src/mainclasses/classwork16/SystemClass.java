package mainclasses.classwork16;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;

public class SystemClass {

    public static void main(String[] args) {

        Map<String, String> getenv = System.getenv();

        for (String key : getenv.keySet()) {
            String value = getenv.get(key);
            System.out.println("Key: " + key + " Value: " + value);
        }

        System.out.println(System.getenv("USER"));

        Locale locale = Locale.getDefault();


        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        long val = 2500000L;
        Locale uahLocal = new Locale("ua", "UA");
        NumberFormat instance = NumberFormat.getInstance(uahLocal);
        System.out.println(instance.getCurrency());

        NumberFormat curInstance = NumberFormat.getCurrencyInstance(uahLocal);
        System.out.println(curInstance.format(val));

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.MONTH, 1);
    }
}
