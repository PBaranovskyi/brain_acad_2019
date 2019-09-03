package bilan_max.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestCollection1{
    public static void main(String[] args) {
        List <String> myList=new ArrayList<>();
        for(int i=0;i<10;i++) {
            myList.add("number");

        }
        ListIterator<String> itr=myList.listIterator();
        while (itr.hasNext()){
            int j=itr.nextIndex();
            System.out.println(itr.next()+"  is at index  "+j);
        }
    }
}
