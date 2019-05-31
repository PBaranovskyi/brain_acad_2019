package Main;

import java.util.Arrays;

public class Lab1_6_4 {
    public static void main(String[] args) {
    int[]myArray =new int[20];
            for(int i=0;i<myArray.length; i++) {
                myArray[i] = ((int) (Math.random() * 40) - 15);
            }
                Arrays.sort(myArray);
                System.out.println("Completely sorted:" + Arrays.toString(myArray));
                int index = Arrays.binarySearch(myArray, 10);
                System.out.println(index);
    }
}
