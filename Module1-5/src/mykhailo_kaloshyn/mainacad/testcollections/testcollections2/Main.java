package mykhailo_kaloshyn.mainacad.testcollections.testcollections2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<String> list = new LinkedList<String>();

        Random rnd = new Random();

        for (int i = 0; i <= 10; i++) {

            int a = rnd.nextInt(i+1);
            list.add(a, "Number_" + i);

        }

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
