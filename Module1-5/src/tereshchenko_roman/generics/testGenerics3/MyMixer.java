package tereshchenko_roman.generics.testGenerics3;

import java.util.Random;

public class MyMixer<T> {

    T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public T[] shuffle() {

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            int randPosition = rand.nextInt(array.length);
            T temp = array[i];
            array[i] = array[randPosition];
            array[randPosition] = temp;
        }
        return array;
    }

}
