package Tomashchuk_Anna.LabWork_2_9_String_processing.Cource_1;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        String str="Its methods do not distinguish among identifiers, numbers, and quoted strings";

        StringTokenizer s1= new StringTokenizer(str);
        // По умолчанию dilimeter = Пробел
        // Тоесть сейчас у нас разделитель - это проюел
        while(s1.hasMoreElements()){
            System.out.println(s1.nextElement());
        }

    }
}
