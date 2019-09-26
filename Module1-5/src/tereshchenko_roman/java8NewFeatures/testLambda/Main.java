package tereshchenko_roman.java8NewFeatures.testLambda;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Main {

    static Integer[] intArr = new Integer[10];

    public static int sumEven(Integer[] arr, Predicate<Integer> predicate) {
        int sum = 0;
        for (Integer number : arr) {
            sum += number;
        }
        return sum;
    }

    public static void printJStr(List<String> list, Predicate<String> predicate) {
        System.out.println("The names starting from B are: ");
        for (String str : list) {
            if (predicate.test(str)) {
                System.out.print( str + " ");
            }
        }
    }

    public static void updateList(List<String> list) {
        MyConverter converter = s -> {
            if (!MyConverter.isNull(s)) {
                s = s.toUpperCase();
            }
            return s;
        };

        for (int i=0; i<list.size(); i++) {
            list.set(i, converter.convertStr(list.get(i)));
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < intArr.length; i++) {
            Random rand = new Random();
            int j = rand.nextInt(100);
            intArr[i] = j;
        }
        System.out.println(Arrays.toString(intArr));
        Arrays.sort(intArr, (a, b) -> b.compareTo(a));
        System.out.println();
        System.out.println(Arrays.toString(intArr));

        System.out.println();

        System.out.println("The sum of even numbers of the array is: " + sumEven(intArr, p -> p % 2 == 0));

        System.out.println();
        List<String> stringList = Arrays.asList("Ann", "Bob", "Ben", "Charles");

        printJStr(stringList, p -> p.charAt(0) == 'B');

        System.out.println();

        updateList(stringList);
        System.out.println("Updated list:");
        stringList.forEach(System.out::println);
    }
}
