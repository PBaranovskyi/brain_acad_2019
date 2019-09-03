package bilan_max.Collections;

import java.util.*;

public class TestCollections3 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list1.add("num" + "_" + i);
            list2.add("number" + "_" + i);
        }
        Iterator<String> itr = list1.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element);
        }
        System.out.println();
        Iterator<String> itr1 = list2.iterator();
        while (itr1.hasNext()) {
            String element1 = itr1.next();
            System.out.println(element1);
        }
        ListIterator<String> iterator = list1.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.add(((LinkedList<String>) list2).element());
        }
        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);
    }
}
