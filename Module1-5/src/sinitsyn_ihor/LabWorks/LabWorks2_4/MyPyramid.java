package sinitsyn_ihor.LabWorks.LabWorks2_4;

import java.util.Scanner;

public class MyPyramid {

    public static int printPyramid(int hight) {
        for (int i = 0; i < hight; i++) {
            switch (i) {
                case 0:
                    System.out.printf("         ");
                    break;
                case 1:
                    System.out.printf("        ");
                    break;
                case 2:
                    System.out.printf("       ");
                    break;
                case 3:
                    System.out.printf("      ");
                    break;
                case 4:
                    System.out.printf("     ");
                    break;
                case 5:
                    System.out.printf("    ");
                    break;
                case 6:
                    System.out.printf("   ");
                    break;
                case 7:
                    System.out.printf("  ");
                    break;
                case 8:
                    System.out.printf(" ");
                    break;
                default:
                    break;
            }
            int numb = 0;
            int check = 0;
            for (int j = (i + 1) * 2 - 1; j > 0; j--) {
                if (check <= j) {
                    numb++;
                    System.out.print(numb);
                    check++;
                } else {
                    numb--;
                    System.out.print(numb);
                    check++;
                }
            }
            System.out.println();
        }
        return hight;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Задайте высоту пирамиды (от 1 до 9): ");
        int h = scan.nextInt();
        if (h > 9 || h < 1) {
            System.out.println("Error!");
        } else {
            MyPyramid.printPyramid(h);
        }
    }
}
