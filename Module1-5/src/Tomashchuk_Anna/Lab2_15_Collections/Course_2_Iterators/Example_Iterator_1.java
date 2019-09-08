package Tomashchuk_Anna.Lab2_15_Collections.Course_2_Iterators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Example_Iterator_1 {
    public static void main(String[] args) {
        Collection<String> myCol = new ArrayList<>();
        myCol.add("aa");
        myCol.add("bbb");
        myCol.add("cccc");
        myCol.add("ddddd");
        System.out.println(myCol); // [aa, bbb, cccc, ddddd]

        Iterator<String> itr = myCol.iterator();
        while (itr.hasNext()) { // hasNext() -это boolean -true, false
            String element = itr.next(); // next() -следующий элемент - двигает курсор
            System.out.println(element + " ");
        }

    }
}
