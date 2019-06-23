package tereshchenko_roman.staticMethodsAndFields;


public class Calculation {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 15, 3, 38};
        int[] arr2 = {12, 4, 26, 3, 1};

        System.out.println(MyMath.findMin(arr1));
        System.out.println(MyMath.findMin(arr2));
        System.out.println(MyMath.findMax(arr1));
        System.out.println(MyMath.findMax(arr2));
    }
}
