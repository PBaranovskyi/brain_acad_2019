package Tomashchuk_Anna.LabWork_2_9_String_processing.Cource_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpr {
    public static void main(String[] args) {
        String inp ="test@ukr.net";
        String emlpat="^\\w+([.\\w]+)*\\w@\\w((.\\w)*\\w+)*\\.\\w{2,3}$";
        Pattern pat = Pattern.compile(emlpat);
        Matcher m = pat.matcher(inp);
        if(m.matches())
            System.out.println("This is e-mail!");
        else
            System.out.println("Error!");
    }
}
