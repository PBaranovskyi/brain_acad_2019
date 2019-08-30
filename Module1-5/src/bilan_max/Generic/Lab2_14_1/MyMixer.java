package bilan_max.Generic.Lab2_14_1;

import java.util.Random;

public class MyMixer<T> {
    private T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public T[] shuffle() {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomPosition = random.nextInt(array.length);
            T temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }
        return array;
    }
}

