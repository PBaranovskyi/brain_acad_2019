package tereshchenko_roman.stringProcessing;

public class Main {


    static String reverseString(String myString) {

        char[] reversedChar = new char[myString.length()];

        for (int i = 0; i < myString.length(); i++) {
            reversedChar[i] = myString.charAt(myString.length()-1 - i);
        }
        String reversedString = new String(reversedChar);
        return reversedString;
    }

    public static void main(String[] args) {

        String myStr = "abracadabra";

        int i1 = myStr.indexOf("ra");
        System.out.println(i1);

        int i2 = myStr.lastIndexOf("ra");
        System.out.println(i2);

        String subStr1 = myStr.substring(3, 7);
        System.out.println(subStr1);

        System.out.println(reverseString(myStr));

    }
}
