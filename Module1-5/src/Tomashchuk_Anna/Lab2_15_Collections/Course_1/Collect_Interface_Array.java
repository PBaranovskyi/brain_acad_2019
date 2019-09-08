package Tomashchuk_Anna.Lab2_15_Collections.Course_1;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;

public class Collect_Interface_Array {
    public static void main(String[] args) {
        Collection<String> myColl1 = new ArrayList<>();
        myColl1.add("aaa");
        myColl1.add("bb");
        myColl1.add("c");

        System.out.println(myColl1); // [aaa, bb, c]

        Object[] myArrObj = myColl1.toArray(); // Из коллекции делает массив
        String[] myArrStr = myColl1.toArray(new String[3]);

        System.out.println(Arrays.toString(myArrObj)); // [aaa, bb, c]
        System.out.println(Arrays.toString(myArrStr)); // [aaa, bb, c]

    }
}
