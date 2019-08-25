package Tomashchuk_Anna.Lab2_12_Nested_Classes.Course_3_Anonymous_Inner_Classes;

import java.util.Arrays;
import java.util.Comparator;

public class Anonymous_Comparator2 {
    public static void main(String[] args) {
        String[] arr = {"java", "se", "course", "one"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String arg0, String arg1) {
                return arg1.length() - arg0.length();
            }
        });
        System.out.println(Arrays.toString(arr));
    }

}
