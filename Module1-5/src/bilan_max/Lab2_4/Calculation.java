package bilan_max.Lab2_4;


import static bilan_max.Lab2_4.MyMath.*;
import static bilan_max.Lab2_4.MyMath.findMaxValue;

public class Calculation {
    public static void main(String[] args) {

        int[] emptyArr = {};

        System.out.println("Result empty: "  + findMaxValue(emptyArr));

        int[] numbers = {-6, -8, 10, 35, 68, 98};
        int[] numbers1={-7,-78,89,122,65,56,87};
        System.out.println("Maximum Value=" + findMaxValue(numbers));
        System.out.println("Minimum Value="+  findMinValue(numbers));
        System.out.println("Maximum Value=" + findMaxValue(numbers1));
        System.out.println("Minimum Value="+ findMinValue(numbers1));
        System.out.println("Area of Circle"+ areaOfCircle());
    }
}