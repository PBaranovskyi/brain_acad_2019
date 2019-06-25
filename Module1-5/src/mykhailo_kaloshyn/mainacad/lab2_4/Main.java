package mykhailo_kaloshyn.mainacad.lab2_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double r = 3;
        int[] arr1 = {5, 7, 9, -2, 0, 11};

        System.out.println(Arrays.toString(arr1));
        System.out.println("Max: " + MyMath.findMax(arr1));
        System.out.println("Min: " + MyMath.findMin(arr1));

        System.out.println("The square of circle with the radius " + r + " is equal: " + MyMath.areaOfCircle(r));

        Employee emp1 = new Employee("Ivan", "Ivanenko", "driver", 244516);
        Employee emp2 = new Employee("Petrov", "Egor", "fireman", 366090);
        Employee emp3 = new Employee("Geda", "Marina", "assistant", 519087);

        System.out.println("Number of employess is: " + emp1.getNumberOfEmployees());

        System.out.println("Number Pi is equal to: " + MyCalc.calcPi(5));

        System.out.println();

        MyPyramid.printPyramid(11);

    }
}
