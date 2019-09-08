package Tomashchuk_Anna.Lab2_15_Collections.Course_2_Iterators;

import java.util.ArrayList;
import java.util.Collection;

public class For_remove {
    public static void main(String[] args) {
        Collection<String> myCol=new ArrayList<>();
        myCol.add("aa");
        myCol.add("bbb");
        myCol.add("cccc");
        myCol.add("ddddd");

        // при несовпадении количества элементов в цикле for - вы хотите перебирать и удалять
        // у Iterator нет таких проблем

        // Exception in thread "main" java.util.ConcurrentModificationException !!!!!!
        for(String str:myCol){
            myCol.remove(str);
        }

    }
}
