package tereshchenko_roman.initializationSections;


import java.util.Arrays;

public class MyInit {
    static int[] arr = new int[10];

   static {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (100 * Math.random());
    }

    public void printArray() {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        MyInit myInit1 = new MyInit();
        MyInit myInit2 = new MyInit();

        myInit1.printArray();
        myInit2.printArray();
    }
}
