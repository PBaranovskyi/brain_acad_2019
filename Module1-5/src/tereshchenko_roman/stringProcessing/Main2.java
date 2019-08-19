package tereshchenko_roman.stringProcessing;

public class Main2 {

    public static void main(String[] args) {

        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        StringBuilder sb = new StringBuilder();

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
