package Tomashchuk_Anna.LabWork_2_9_String_processing;

public class Lab293 {
    static char[] uniqeChars(String s) {
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            String substr = stb.toString();
            if (substr.indexOf(temp) == -1){
                stb.append(temp);
            }
        }
        String newString = stb.toString();
        char[] finalChar = newString.toCharArray();
        return finalChar;
    }
    public static void main(String[] args) {
        System.out.println(uniqeChars("Using methods of class String"));
    }
}
