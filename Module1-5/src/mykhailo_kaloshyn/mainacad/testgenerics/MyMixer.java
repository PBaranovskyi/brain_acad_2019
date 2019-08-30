package mykhailo_kaloshyn.mainacad.testgenerics;

import java.util.Random;

public class MyMixer<T> {

    private T[] arr;

    public MyMixer(T[] arr) {
        this.arr = arr;
    }

    public T[] shuffle () {
        Random randomPosition = new Random();
        for (int i=0; i<arr.length; i++) {
            int randomPos = randomPosition.nextInt(arr.length);
            T temp = arr[i];
            arr[i] = arr[randomPos];
            arr[randomPos] = temp;
        }
      return arr;
    }

}
