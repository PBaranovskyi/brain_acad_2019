package bilan_max.Lab2_9;

public class TestString2 {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myStr1.length(); i++) {
            char myChar = myStr1.charAt(i);
            for (int j = 0; j < myStr2.length(); j++) {
                if (myStr2.indexOf(myChar) == -1) {
                    sb.append(myChar);
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
