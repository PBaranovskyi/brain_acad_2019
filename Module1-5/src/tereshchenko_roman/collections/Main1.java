package tereshchenko_roman.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            list.add("number_" +i);
        }

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element);
        }
    }
}
