package sinitsyn_ihor.LabWorks.LabWorks2_5;

public class MyInit {
    private static int[] arr = new int[10];

    /*static*/ {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100 * Math.random());
        }
    }

    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + ".");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    public int[] getArr() {
        return arr;
    }
}
