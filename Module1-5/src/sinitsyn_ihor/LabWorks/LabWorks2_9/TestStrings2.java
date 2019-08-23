package sinitsyn_ihor.LabWorks.LabWorks2_9;

public class TestStrings2 {

    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        StringBuilder sb = new StringBuilder();
        char[] firstArr = myStr1.toCharArray();
        char[] secondArr = myStr2.toCharArray();
        for (int i = 0; i < firstArr.length; i++){
            for (int j = 0; j < secondArr.length; j++){
                if (firstArr[i] == secondArr[j]){
                    sb.append(firstArr[i]);
                }
            }
        }
        System.out.println(sb);
    }
}
