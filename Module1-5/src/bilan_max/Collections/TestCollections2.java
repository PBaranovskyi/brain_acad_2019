package bilan_max.Collections;

import java.util.*;

public class TestCollections2 {
    public static void main(String[] args) {
        List<String> myList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            myList.add("number" + "_"+i);
        }
        Collections.shuffle(myList);
        Iterator<String> itr=myList.iterator();
        while (itr.hasNext()){
            String element=itr.next();
            System.out.println(element);
        }
    }
}