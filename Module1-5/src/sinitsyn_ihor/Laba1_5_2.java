package sinitsyn_ihor;

import java.util.Scanner;
class Laba1_5_2 {
    public static void main(String[] args) {
        System.out.println("Please, enter the number Х (within the limits of Int type): ");
        Scanner scanNumber = new Scanner(System.in);
        int x = scanNumber.nextInt();
        switch(x){
            case 0:
                System.out.println("You entered the number Zero.");
                break;
            case 1:
                System.out.println("You entered the number One.");
                break;
            case 2:
                System.out.println("You entered the number Two.");
                break;
            case 3:
                System.out.println("You entered the number Three.");
                break;
            case 4:
                System.out.println("You entered the number Four.");
                break;
            case 5:
                System.out.println("You entered the number Five.");
                break;
            case 6:
                System.out.println("You entered the number Six.");
                break;
            case 7:
                System.out.println("You entered the number Seven.");
                break;
            case 8:
                System.out.println("You entered the number Eight.");
                break;
            case 9:
                System.out.println("You entered the number Nine.");
                break;
            case 10:
                System.out.println("You entered the number Ten.");
                break;
            default:
                if (x<0){
                    System.out.println("You entered the number less then Zero.");
                }
                else {
                    System.out.println("You entered the number more than Ten.");
                }
                break;
        }
    }
}