package mykhailo_kaloshyn.mainacad.lab2_9.teststring2;

public class Main {

    public static void main(String[] args) {

        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        System.out.println(myStr1);
        System.out.println(myStr2);
        System.out.println(uniqueLetters(myStr1, myStr2));

    }

    static StringBuilder uniqueLetters(String str1, String str2) {

        StringBuilder sb = new StringBuilder(str1);

        for (int i = 0; i < sb.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (sb.charAt(i) == str2.charAt(j)) {
                    sb.delete(i, i + 1);
                    i--;
                    break;
                }
            }
        }

        return sb;
    }
}
