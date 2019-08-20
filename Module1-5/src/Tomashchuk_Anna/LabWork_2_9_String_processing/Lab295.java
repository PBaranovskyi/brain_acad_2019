package Tomashchuk_Anna.LabWork_2_9_String_processing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab295 {
    public static void main(String[] args) {
        String inp="Anna";


        String namepat="^\\w";
        Pattern pat =Pattern.compile(namepat);
        Matcher m=pat.matcher(inp);
        if(m.matches())
            System.out.println("This is name");
        else
            System.out.println("This is not name");

    }
}
