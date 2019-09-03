package mykhailo_kaloshyn.mainacad.testcollections.testcollections3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<String>();

        for (int i = 0; i <= 10; i++) {
            list1.add("Number_" + i);
            list2.add("Num_" + i);
        }

        printElements(list1);
        printElements(list2);

        ListIterator<String> listIter = list2.listIterator();
        Iterator<String> itr = list1.iterator();

        while (listIter.hasNext()) {
            listIter.next();
        }

        while (listIter.hasPrevious()){
            if (itr.hasNext()) {
                listIter.add(itr.next());
            }
            listIter.previous();
            listIter.previous();

        }

        printElements(list2);

        /*while (listIter.hasNext()) {
            listIter.next();
            Iterator<String> itr1 = list1.iterator();
            while (itr1.hasNext()) {
                listIter.add(itr1.next());
            }
            if (listIter.hasNext()) {
                listIter.next();
            }
        }*/

        //printElements(list2);
    }

    public static <E> void printElements(List<E> list) {

        Iterator<E> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("====================================");

    }
}
