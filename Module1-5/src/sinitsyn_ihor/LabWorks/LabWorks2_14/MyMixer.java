package sinitsyn_ihor.LabWorks.LabWorks2_14;

import java.util.Random;

public class MyMixer <T> {
    private T[] arr;
    Random rand = new Random();
    public MyMixer(T[] arr){
        this.arr = arr;
    }
    public T[] shuffle(){
        for (int i = 0; i < arr.length; i++){
            T value = arr[i];
            int temp = rand.nextInt(arr.length);
            arr[i] = arr[temp];
            arr[temp] = value;
        }
        return arr;
    }
}
