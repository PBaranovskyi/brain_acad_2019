package Tomashchuk_Anna.Lab2_15_Collections.Course_1;

import java.util.ArrayList;
import java.util.Collection;

public class bulk_operations {
    public static void main(String[] args) {
        // bulk operations perform - выполнение массовых операций
        Collection<String> myColl1=new ArrayList<>();
        Collection<String> myColl2=new ArrayList<>();

        myColl1.add("aaa");
        myColl1.add("bb");
        myColl1.add("c");

        myColl2.add("aaa");
        myColl2.add("bb");

        System.out.println(myColl1); // [aaa, bb, c]
        System.out.println(myColl2); // [aaa, bb]

        System.out.println(myColl1.containsAll(myColl2)); //true
        System.out.println(myColl1.removeAll(myColl2)); // удаляет все элементы первой коллекции из второй
        System.out.println(myColl1); // [c]

    }
}
