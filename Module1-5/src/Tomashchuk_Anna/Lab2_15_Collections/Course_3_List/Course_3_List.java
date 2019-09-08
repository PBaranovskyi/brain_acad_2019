package Tomashchuk_Anna.Lab2_15_Collections.Course_3_List;

import java.util.ArrayList;
import java.util.List;

public class Course_3_List {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<String>();
        lst.add("aa");
        lst.add("bbb");
        lst.add("cccc");
        System.out.println(lst); // [aa, bbb, cccc]

        lst.add(3,"100");
        System.out.println(lst); // [aa, bbb, cccc, 100] - индекс - 0 1 2 3

        lst.add(2,"200");
        System.out.println(lst); // [aa, bbb, 200, cccc, 100]


    }
}
