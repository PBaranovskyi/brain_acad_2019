package tereshchenko_roman.staticMethodsAndFields;

public class MyMath {

//    static int[] arr = {1, 5, 18, 3, 39};

    public static int findMin(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    public static int findMax(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }

        return maxValue;
    }

    public static final double PI = 3.14;

    public static double areaOfCircle (double r){
        double area = (r * r * PI);
        return area;
    };



//    public static void main(String[] args) {
//        System.out.println(findMin(arr));
//        System.out.println(findMax(arr));
//    }

//    Lab Work 2-4-3
//    public static void main(String[] args) {
//        System.out.println(areaOfCircle(5));
}