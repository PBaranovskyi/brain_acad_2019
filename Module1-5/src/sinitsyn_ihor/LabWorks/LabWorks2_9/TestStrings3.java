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

    public static String uniqueChars(String str){
        char[] arr = str.toCharArray();
        boolean check = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++){
            for (int j = arr.length -1; j > i; j--){
                if (arr[i] == arr[j]){
                    check = false;
                }
            }
            if (check){
                sb.append(arr[i]);
            }
        }
        String myStr = sb.toString();
        //char[] newArr = myStr.toCharArray();
        return myStr;
    }
}
