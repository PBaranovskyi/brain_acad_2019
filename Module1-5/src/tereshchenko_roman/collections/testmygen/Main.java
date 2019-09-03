package tereshchenko_roman.collections.testmygen;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyNumGenerator myNumGen = new MyNumGenerator(5, 8);

        System.out.println(myNumGen.generate());

        MyNumGenerator myDistNumGen = new MyNumGenerator(5, 64);

        System.out.println(myDistNumGen.generateDistinct());
    }
}
