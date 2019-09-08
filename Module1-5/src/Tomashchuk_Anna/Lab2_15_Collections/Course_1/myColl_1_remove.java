package Tomashchuk_Anna.Lab2_15_Collections.Course_1;

import java.util.ArrayList;
import java.util.Collection;

public class myColl_1_remove {
    public static void main(String[] args) {
        Collection<String> myColl = new ArrayList<>();
        myColl.add("aaa");
        myColl.add("bbbb");
        myColl.add("ccccc");
        System.out.println(myColl); // [aaa, bbbb, ccccc]

        System.out.println(myColl.remove("bbbb")); // remove - удаляет элемен "bbbb"
        System.out.println(myColl.remove("abcd"));  // false
        System.out.println(myColl);  // [aaa, ccccc]
        System.out.println(myColl.contains("aaa")); // выдает true, если такой элемент есть в коллекции
        System.out.println(myColl.contains("bbbb")); // false - такого элемента нет в коллекции
    }
}
