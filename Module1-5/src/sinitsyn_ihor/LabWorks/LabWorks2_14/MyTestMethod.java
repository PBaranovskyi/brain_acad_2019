package sinitsyn_ihor.LabWorks.LabWorks2_14;

public class MyTestMethod {
    public static <T extends Comparable> int calcNum (T[] arr, T maxElem){
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i].compareTo(maxElem) > 0){
                result++;
            }
        }
        return result;
    }
}
