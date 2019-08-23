package sinitsyn_ihor.LabWorks.LabWorks2_9;

import java.util.Scanner;

public class TestStrings3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert your text:");
        String str = scan.nextLine();
        String myStr = uniqueChars(str);
        System.out.println(myStr);
    }

    public static String uniqueChars(String str) {
        char[] arr = str.toCharArray();
        int check = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    check++;
                }
            }
            if (check == 1) {
                sb.append(arr[i]);
            }
            check = 0;
        }
        String myStr = sb.toString();
        //char[] newArr = myStr.toCharArray();
        return myStr;
    }
}
