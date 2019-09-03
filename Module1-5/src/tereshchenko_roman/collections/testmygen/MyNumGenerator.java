package tereshchenko_roman.collections.testmygen;

import java.util.*;

public class MyNumGenerator {

    private int numOfElm;
    private int maxNumb;


    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public List generate() {
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < numOfElm; i++) {
            Random rand = new Random();
            int value = rand.nextInt(maxNumb);
            myList.add(value);
        }
        return myList;
    }

    public Set<Integer> generateDistinct() {
        Set<Integer> myDistList = new HashSet<>();
        for (int i = 0; i < numOfElm; i++) {
            Random rand = new Random();
            int value = rand.nextInt(maxNumb);
                myDistList.add(value);
        }
        return myDistList;
    }
}
