package tereshchenko_roman.staticMethodsAndFields;

import static tereshchenko_roman.staticMethodsAndFields.MyMath.findMax;
import static tereshchenko_roman.staticMethodsAndFields.MyMath.findMin;

public class Calculation {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 15, 3, 38};
        int[] arr2 = {12, 4, 26, 3, 1};

        System.out.println(findMin(arr1));
        System.out.println(findMin(arr2));
        System.out.println(findMax(arr1));
        System.out.println(findMax(arr2));
    }
}
