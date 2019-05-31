package mainclasses;

public class Arrays {

    public static void main(String[] args) {

        int[] arr = new int[5];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = i*i;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            System.out.println(element);
        }

        for (int element : arr) {
            System.out.println(element);
        }


    }
}
