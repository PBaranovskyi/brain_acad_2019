import java.util.Arrays;

public class Lab1_6_4 {
    public static void main(String[] args) {
        {
            int[] myArray = {2, 5, 12, 65, 38, 13, 29, 698};
            Arrays.sort(myArray);
            System.out.println(Arrays.toString(myArray));
            int key = 13;
            System.out.println(Arrays.binarySearch(myArray, key));
        }
    }
}
