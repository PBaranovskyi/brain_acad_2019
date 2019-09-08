package Tomashchuk_Anna.Lab2_15_Collections.Course_2_Iterators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator_remove {
    public static void main(String[] args) {
        Collection<String> myCol = new ArrayList<>();
        myCol.add("aa");
        myCol.add("bbb");
        myCol.add("cccc");
        myCol.add("ddddd");

        System.out.println(myCol);

        // Как удалять элементы из коллекции в цикле for ? -
        //- Для этого нужно использовать Iterator . Это вопрос на собеседовании !!!
        Iterator<String> itr = myCol.iterator();
        while (itr.hasNext()) {
            itr.next();
            itr.remove();
        }

        System.out.println(myCol); // [] - пустая коллекция, все удалтлось
    }
}
