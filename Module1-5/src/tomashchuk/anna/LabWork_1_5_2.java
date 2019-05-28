package tomashchuk.anna;
import java.util.Scanner;

public class LabWork_1_5_2 {
    public static void main(String[] args){
        System.out.print("Введите любое целое число x от 1 до 100: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println ("Вы ввели число " + number);

        int temp;
        temp=number;
        String numberStr;
        switch(temp){
            case 1:numberStr="One";
                break;
            case 2:numberStr="Two";
                break;
            case 3:numberStr="Three";
                break;
            case 4:numberStr="Four";
                break;
            case 5:numberStr="Five";
                break;
            case 6:numberStr="Six";
                break;
            case 7:numberStr="Seven";
                break;
            case 8:numberStr="Eight";
                break;
            case 9:numberStr="Nine";
                break;
            // ...
            default: numberStr="Other";
                break;
        }
        System.out.println(numberStr);

    }
}
