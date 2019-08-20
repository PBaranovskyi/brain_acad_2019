package mainclasses.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {
    public static void main(String[] args) {
        String [] arrayStr = {"VOVA","Ivan","R2d2","ZX","Anna","12345","ToAd","TomCat"," "};
        for (String str : arrayStr) {
            System.out.println(str + " -> " + checkPersonWithRegExp(str));
        }
    }

    public static boolean checkPersonWithRegExp(String userNameString) {
        String regexp = "^[A-Z][a-z]+$";
        Pattern patt = Pattern.compile(regexp);
        Matcher matcher = patt.matcher(userNameString);
        boolean matches = matcher.matches();
        try {
            System.out.println(matcher.group());
        } catch (Exception r){

        }
        return matches;
    }
}

