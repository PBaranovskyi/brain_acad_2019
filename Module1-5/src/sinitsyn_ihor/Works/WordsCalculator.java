package sinitsyn_ihor.Works;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class WordsCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write your words, please: ");
        String message = scan.nextLine();
        String[] arr = message.split("[\\s?!.,-]+");

        Map<String, Integer> result = new HashMap<>();
        Set<String> wordsSet = new HashSet<>();
        for (String word : arr) {
            if (!wordsSet.add(word)) {
                Integer counter = result.get(word);
                result.put(word, ++counter);
            } else {
                result.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : result.entrySet()) {
            if (stringIntegerEntry.getValue() > 1) {
                System.out.println(stringIntegerEntry.getKey() + " =" + stringIntegerEntry.getValue());
            }
        }
        System.out.println(result);
    }
}
