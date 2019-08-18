package bilan_max.Lab2_9;

public class TestString3 {
    static char[] uniqueChars(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char myChar = s.charAt(i);
            String myStr=sb.toString();
            if(myStr.indexOf(myChar)==-1){
                sb.append(myChar);

            }
        }
        String newString = sb.toString();
        char[] finalChar = newString.toCharArray();
        return finalChar;
    }

    public static void main(String[] args) {
        System.out.println(uniqueChars("Using methods of class String"));
    }
}

