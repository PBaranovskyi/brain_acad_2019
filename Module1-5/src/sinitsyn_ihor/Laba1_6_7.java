package sinitsyn_ihor;

import java.util.Scanner;

public class Laba1_6_7 {
    public static void main(String[] args) {
        int[][] myArray = {{1, 1, 1, 3, 4}, {2, 1, 3, 1, 2}, {2, 2, 3, 4, 1}, {3, 3, 3, 1, 4}};
        System.out.println("We can take the matrix, for example :");
        for (int i = 0; i < myArray.length; i++) {
            for (int e = 0; e <= myArray.length; e++) {
                System.out.print(myArray[i][e] + " ");
            }
            System.out.println();
        }
        System.out.print("And finds a some number, choose it (from 1 to 4): ");
        Scanner scanNumb = new Scanner(System.in);

        int myNumb = scanNumb.nextInt();
        boolean check = true;
        if (myNumb > 4 || myNumb < 0) {
            System.out.println("FROM 1 TO 4! Repeat, please.");
        } else {
            for (int i = 0; i < myArray.length; i++) {
                if (check == true) {
                    System.out.print("Line " + (i + 1) + ": [");
                }
                for (int j = 0; j <= myArray.length; j++) {
                    if (myArray[i][j] == myNumb) {
                        System.out.print(j + " ");
                        check = true;
                    }
                }
                System.out.print("]");
                System.out.println();
            }
        }
    }
}
