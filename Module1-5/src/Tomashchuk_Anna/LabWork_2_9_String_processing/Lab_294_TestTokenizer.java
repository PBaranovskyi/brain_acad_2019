package Tomashchuk_Anna.LabWork_2_9_String_processing;

import java.util.StringTokenizer;

public class Lab_294_TestTokenizer {
    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student: Anna Tomashchuk";

        StringTokenizer s1 = new StringTokenizer(myStr);
        while (s1.hasMoreElements()) {
            System.out.println(s1.nextElement());
        }

        System.out.println("--------------------------------------");

        StringTokenizer s2 = new StringTokenizer(myStr, ",");
        while (s2.hasMoreElements()) {
            System.out.println(s2.nextElement());
        }
        System.out.println("--------------------------------------");

        StringTokenizer s3 = new StringTokenizer(myStr, ".");
        while (s3.hasMoreElements()) {
            System.out.println(s3.nextElement());
        }


    }

}
