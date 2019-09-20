package tereshchenko_roman.stringProcessing;

import java.util.*;

public class Main5 {

    public static void main(String[] args) {


        Map<String, Integer> myMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        String incText = scanner.nextLine();

        String[] myList = incText.split(" ");
        Set<String> wordSet = new HashSet<>();
        for (
                String word : myList) {
            if (!wordSet.add(word)) {
                Integer counter = myMap.get(word);
                myMap.put(word, counter);
            } else myMap.put(word, 1);
        }
        System.out.println(myMap);
    }
}

