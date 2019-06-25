package sinitsyn_ihor.LabWorks.LabWorks2_4;

import java.math.BigDecimal;
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
        double area = MyMath.areaOfCircle(rad);
        System.out.println("Square of the circle is " + Math.round(area *100.0)/100.0);
        BigDecimal decimal = new BigDecimal(area);
        double result = decimal.setScale(5, BigDecimal.ROUND_FLOOR).doubleValue();
        System.out.println(result);
    }
}
