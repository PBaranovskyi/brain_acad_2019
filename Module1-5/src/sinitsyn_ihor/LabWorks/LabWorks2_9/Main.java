package sinitsyn_ihor.LabWorks.LabWorks2_9;

public class Main {
    public static void main(String[] args) {
        String myStr = "abracadabra";
        int first = myStr.indexOf("ra");
        int last = myStr.lastIndexOf("ra");
        String substring = myStr.substring(3, 7);
        System.out.println("First index: " + first + ", last index: " + last + ", substring: " + substring);
    }
}
