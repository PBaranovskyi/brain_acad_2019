package Tomashchuk_Anna.LabWork_2_9_String_processing.Cource_1;

import java.util.StringTokenizer;

public class StringToken_2 {
    public static void main(String[] args) {
        String str="Its methods do not distinguish among identifiers, numbers, and quoted strings";

        StringTokenizer s2=new StringTokenizer(str,",");
        // Указываем что dilimeter запятая
        // Тоесть сейчас у нас разделитель - это запятая
        while(s2.hasMoreElements()){
            System.out.println(s2.nextElement());
        }
    }
}
