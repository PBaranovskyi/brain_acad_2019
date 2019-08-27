package sinitsyn_ihor.LabWorks.LabWorks2_9;

import java.util.StringTokenizer;

public class TestTokennizer {

    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student: Ihor Sinitsyn";
        StringTokenizer str = new StringTokenizer(myStr, "., ");
        while (str.hasMoreElements()) {
            System.out.println(str.nextElement());
        }
    }
}
