package bilan_max.Lab2_9;

public class TestString1 {
    public static void main(String[] args) {
        String myStr = "abracadabra";
        int i1 = myStr.indexOf("ra");
        int i2 = myStr.lastIndexOf("ra");
        System.out.println(i1);
        System.out.println(i2);
        String substr1 = myStr.substring(3, 7);
        System.out.println(substr1);
        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(myStr);

        // reverse StringBuilder input1
        input1 = input1.reverse();

        // print reversed String
        System.out.println(input1);
    }
}
