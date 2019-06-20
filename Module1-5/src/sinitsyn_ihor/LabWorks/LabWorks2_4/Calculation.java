package sinitsyn_ihor.LabWorks.LabWorks2_4;

import java.util.Arrays;
import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        MyMath ar =  new MyMath();
        MyMath mat =  new MyMath();
        ar.setArr();
        int arr1[] = ar.getArr();
        System.out.println("Your random array is: " + Arrays.toString(arr1));
        mat.setMatrix();
        int mat1[][] = mat.getMatrix();
        System.out.println("Your random matrix is: " + Arrays.deepToString(mat1));
        System.out.println("Your minimal value for array is " + MyMath.findMin(arr1) + " and your maximum value is " + MyMath.findMax(arr1));
        System.out.println("Your minimal value for matrix is " + MyMath.findMin(mat1) + " and your maximum value is " + MyMath.findMax(mat1));

        Scanner scan = new Scanner(System.in);
        System.out.print("Please, set the radius of the circle (double type): ");
        double rad = scan.nextDouble();
        System.out.println("Square of the circle is " + Math.round(MyMath.areaOfCircle(rad)*100.0)/100.0);
    }
}
