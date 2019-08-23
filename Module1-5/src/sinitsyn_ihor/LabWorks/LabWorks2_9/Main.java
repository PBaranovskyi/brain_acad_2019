package sinitsyn_ihor.LabWorks.LabWorks2_9;

public class Main {
    public static void main(String[] args) {
        String myStr = "abracadabra";
        int first = myStr.indexOf("ra");
        int last = myStr.lastIndexOf("ra");
        String substring = myStr.substring(3, 7);
        System.out.println("First index: " + first + ", last index: " + last + ", substring: " + substring);
        //System.out.println("After reversing: " + Main.reversString(myStr));
        StringBuilder revStr = new StringBuilder(myStr);
        revStr.reverse();
        System.out.println(myStr + " --> " + revStr);
    }

    static String reversString(String incStr) {
        char[] firstArr = incStr.toCharArray();
        char[] secondArr = new char[firstArr.length];
        for (int i = 0; i < firstArr.length; i++) {
            secondArr[i] = firstArr[firstArr.length - 1 - i];
        }
        String myStr = new String(secondArr);
        return myStr;
    }
}
