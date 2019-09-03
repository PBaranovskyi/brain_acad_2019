package mykhailo_kaloshyn.mainacad.testcollections.testcollections1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        for (int i=0; i<=10; i++) {
            list.add("Number_" + i);
        }

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
