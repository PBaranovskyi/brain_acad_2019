package tereshchenko_roman.collections;

import java.util.*;

public class Main3 {

    public static void main(String[] args) {

        List<String> arrList = new ArrayList<String>();
        List<String> linkList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            arrList.add("number_" + i);
        }

        for (int i = 0; i < 10; i++) {
            linkList.add("num_" + i);
        }

        Iterator<String> iter = arrList.iterator();
        while (iter.hasNext()) {
            String element = iter.next();
            System.out.println(element);
        }

        System.out.println("============");

        Iterator<String> iter2 = linkList.iterator();
        while (iter2.hasNext()){
//            String element = iter2.next();
            System.out.println(iter2.next());
        }

        System.out.println("=============");

        ListIterator<String> listIterator = linkList.listIterator();

        while (listIterator.hasNext()){

            arrList.add(1, listIterator.next());
        }

        System.out.println(arrList);
        System.out.println(linkList);

    }


}
