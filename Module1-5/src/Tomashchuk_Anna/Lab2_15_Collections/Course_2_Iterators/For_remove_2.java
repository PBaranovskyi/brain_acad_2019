package Tomashchuk_Anna.Lab2_15_Collections.Course_2_Iterators;

import java.util.ArrayList;
import java.util.Collection;

public class For_remove_2 {
    public static void main(String[] args) {
        Collection<String> myCol=new ArrayList<>();
        myCol.add("aaa");
        myCol.add("bbb");
       // myCol.add("c");
       // myCol.add("d");

        // при несовпадении количества элементов в цикле for - вы хотите перебирать и удалять
        // у Iterator нет таких проблем
        // Так будет работать, потому что только 2 элемента aaa и bbb
        // это частрый случай, и так писать неправильно

        // Как удалять элементы из коллекции в цикле for ? -
        //- Для этого нужно использовать Iterator . Это вопрос на собеседовании !!!

        // Exception in thread "main" java.util.ConcurrentModificationException !!!!!!
        // Process finished with exit code 0
        for(String str:myCol){
            myCol.remove(str);
        }
        
    }
}
