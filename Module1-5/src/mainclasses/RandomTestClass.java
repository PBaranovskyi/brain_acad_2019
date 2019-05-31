package mainclasses;

import java.util.Random;

public class RandomTestClass {

    public static void main(String[] args) {
        int x = (int) (Math.random() * 100);

        Random rand = new Random();

        int nextInt = rand.nextInt(1000);

        System.out.println(nextInt);
    }
}
