package tereshchenko_roman.StringProcessing;

import java.util.StringTokenizer;

public class Main4 {

    public static void main(String[] args) {
        String myString = "This is String, split by StringTokennizer. Created by student: Roman Tereshchenko";

        StringTokenizer st1 = new StringTokenizer(myString);
        while (st1.hasMoreElements()) {
            System.out.println(st1.nextElement());
        }

        System.out.println();

        StringTokenizer st2 = new StringTokenizer(myString, ",");
        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());

        }

        System.out.println();

        StringTokenizer st3 = new StringTokenizer(myString, ".");
        while (st3.hasMoreElements()) {
            System.out.println(st3.nextElement());

        }
    }
}
