package Tomashchuk_Anna.Lab2_15_Collections.Course_1;

import java.util.ArrayList;
import java.util.Collection;

public class myColl {
    public static void main(String[] args) {
        Collection<String> myColl = new ArrayList<>();
        //Collection -они Generic и они работают только со String
        myColl.add("aaa");
        myColl.add("bbbb");
        myColl.add("ccccc");
        System.out.println(myColl); // [aaa, bbbb, ccccc]

        int sizeOfColl = myColl.size();  // размер
        System.out.println(sizeOfColl); // 3

        myColl.clear();  //чистит b\и ничего там не остается
        System.out.println(myColl); // []

    }
}
