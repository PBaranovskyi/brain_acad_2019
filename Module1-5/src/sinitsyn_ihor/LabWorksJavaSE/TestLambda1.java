package sinitsyn_ihor.LabWorksJavaSE;

import java.util.function.Predicate;

public class TestLambda1 {
    public static void main(String[] args) {

    }
    public static int sum (Integer[] intArr, Predicate<Integer> predicate){
        int sum = 0;
        for (Integer i:intArr) {
            if(predicate.test(i)){
                sum+=i;
            }
        }
        return sum;
    }
}
