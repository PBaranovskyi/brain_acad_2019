package Tomashchuk_Anna.LabWork_2_9_String_processing.Lab292;

public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        StringBuilder sb = new StringBuilder();
        //Надо 1. Создать Stringbuilder.
        // 2. Брать по одной букве из первого слова, проверять их по indexOf второго,
        // и если возвращает -1, добавлять в Stringbuilder.

        for (int i = 0; i < myStr1.length(); i++) {
            char temp = myStr1.charAt(i);
            for (int j = 0; j < myStr2.length(); j++) {
                if (myStr2.indexOf(temp) == -1) {
                    sb.append(temp);
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
