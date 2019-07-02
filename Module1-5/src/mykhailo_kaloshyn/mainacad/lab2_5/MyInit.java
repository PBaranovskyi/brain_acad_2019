package mykhailo_kaloshyn.mainacad.lab2_5;

public class MyInit {

    //private int[] arr;
    private static int[] arr;

    /*{
        this.arr = new int[10];
        for (int i = 0; i <= 9; i++) {
            this.arr[i] = (int) (100 * Math.random());
        }
    }*/

    static {
        arr = new int[10];
        for (int i = 0; i <= 9; i++) {
            arr[i] = (int) (100 * Math.random());
        }
    }

    static void printArray(MyInit obj) {
        for (int i = 0; i < obj.arr.length; i++) {
            if (i < (obj.arr.length - 1)) {
                System.out.print(obj.arr[i] + ", ");
            } else {
                System.out.println(obj.arr[i]);
            }
        }
    }

}
