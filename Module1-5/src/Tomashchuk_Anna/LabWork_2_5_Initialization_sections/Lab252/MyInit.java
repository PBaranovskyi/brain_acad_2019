package Tomashchuk_Anna.LabWork_2_5_Initialization_sections.Lab252;

import java.util.Arrays;

public class MyInit {
    private int[] arr; //Create class MyInit with field arr of array of integers

    { // non-static initialization block
        int[] arr = new int[10]; //Size of array is 10
        for (int i = 0; i < arr.length; i++) {
            //  arr[i] = a++;
            arr[i] = (int) (100 * Math.random());

        }
       System.out.println(Arrays.toString(arr));
    }

   // public void setArr(int[] arr) {
       // this.arr=arr;
   // }

   // public int[] getArr(){return arr;}

    public void printArray(){
       System.out.println(Arrays.toString(arr));

    }

}
