package tereshchenko_roman.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main2 {

    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();


        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            int index = rand.nextInt(10);
            list.add("number_" + index);
        }

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element);
        }
    }
}

