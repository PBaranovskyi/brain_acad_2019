package sinitsyn_ihor;

import java.util.Scanner;

public class Testing {
    static char [] alfa = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я', 'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', ',', '.', ' '};
    static char [] beta = {'С', 'Л', 'Е', 'М', 'О', 'Ъ', 'Щ', 'Н', 'Х', 'У', 'Ж', 'Г', 'Ё', 'Д', 'Я', 'Э', 'Ч', 'Ш', 'Ф', 'Б', 'Т', 'Ы', 'Р', 'А', 'Ц', 'П', 'З', 'Й', 'И', 'В', 'Ь', 'К', 'Ю', 'с', 'л', 'е', 'м', 'о', 'ъ', 'щ', 'н', 'х', 'у', 'ж', 'г', 'ё', 'д', 'я', 'э', 'ч', 'ш', 'ф', 'б', 'т', 'ы', 'р', 'а', 'ц', 'п', 'з', 'й', 'и', 'в', 'ь', 'к', 'ю', ',', '.', ' '};
    public static void main(String[] boobs) {
        System.out.println("Write your text: ");
        Scanner scan = new Scanner(System.in);
        String myCod = scan.nextLine();
        char[] myArr = myCod.toCharArray();
        char[] newArr = new char[myArr.length];
        for (int i = 0; i < myArr.length; i++) {
            char temp = myArr[i];
            for (int j = 0; j < alfa.length; j++) {
                if (alfa[j] == temp) {
                    newArr[i] = beta[j];
                }
            }
        }
        String answer = new String(newArr);
        System.out.println(answer);
    }
}