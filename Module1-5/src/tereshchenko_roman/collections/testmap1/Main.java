package tereshchenko_roman.collections.testmap1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyTranslator translator = new MyTranslator();

        translator.addNewWord("cat", "кот");
        translator.addNewWord("mouse", "мышь");
        translator.addNewWord("translation", "перевод");

        System.out.println(translator.translate("translation"));

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        System.out.println(translator.translate(input));
    }
}
