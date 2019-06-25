package LabWork_1_6;

public class LabWork_1_6_7_Finding_Duplicates {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9, 2, 11, 23, 14, 2, 1, 5, 7, 8, 11};
        java.util.Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++)
            if (arr[i - 1] == arr[i]) {
                System.out.println("Duplicate number is " + arr[i]);
                i += 1;
            }
    }
}
