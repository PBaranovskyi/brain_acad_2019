package mykhailo_kaloshyn.mainacad.lab2_9.teststring1;

public class Main {

    public static void main(String[] args) {

        String myStr = "abracadabra";

        System.out.println("The first [ra] is on the position: " + myStr.indexOf("ra"));
        System.out.println("The last [ra] is on the position: " + myStr.lastIndexOf("ra"));
        System.out.println("Substring from 3 to 7 position is: " + myStr.substring(3, 7));
        System.out.println(myStr);
        System.out.println(reverseString(myStr));
    }

    static String reverseString(String str) {

        char[] strArr = str.toCharArray();
        char[] revertedStrArr = new char[strArr.length];

        for (int i = 0; i < str.length(); i++) {
            revertedStrArr[i] = strArr[strArr.length - 1 - i];
        }

        String revertedStr = new String(revertedStrArr);

        return revertedStr;
    }

}
