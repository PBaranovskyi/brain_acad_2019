package sinitsyn_ihor.LabWorks.LabWorks2_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegExp {

    public static void main(String[] args) {
        String[] myArr = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};
        for (int i = 0; i < myArr.length; i++) {
            System.out.println(checkPersonWithRegExp(myArr[i]));
        }
    }

    public static boolean checkPersonWithRegExp(String userNameString) {
        //String emplat = "\\^?[A-Z]";
        Pattern pat = Pattern.compile("[A-Z][a-z]+");
        Matcher m = pat.matcher(userNameString);
        boolean check = m.matches();
        return check;
    }
}
