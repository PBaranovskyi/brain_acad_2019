package sinitsyn_ihor.Works;

import java.util.Scanner;

public class WordsCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write your words, please: ");
        String message = scan.nextLine();
        String[] arr = message.split("[\\s?!.,-]+");
        for (String word : arr) {
            System.out.println(word);
        }

    }
}
