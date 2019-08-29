package tereshchenko_roman.generics.testGenerics2;

public class Main {
    public static void main(String[] args) {

        System.out.println("2_14_2");

        Integer[] intArrRand = new Integer[10];
        for (int i = 0; i < intArrRand.length; i++)
            intArrRand[i] = (int) (Math.random() * 100);

        System.out.println("Array values: " + java.util.Arrays.toString(intArrRand));
        System.out.println("Number of elements that are greater than 50: " + MyTestMethod.calcNum(intArrRand, 50));

        System.out.println();

        Double[] doubleArrRand = new Double[10];
        for (int i = 0; i < doubleArrRand.length; i++)
            doubleArrRand[i] = (double) Math.round(Math.random() * 100);


        System.out.println("Array values: " + java.util.Arrays.toString(doubleArrRand));
        System.out.println("Number of elements that are greater than 50.0: " + MyTestMethod.calcNum(doubleArrRand, 50.0));

        System.out.println();
        System.out.println("2_14_3");

        Integer[] intArrRand1 = new Integer[10];
        for (int i = 0; i < intArrRand1.length; i++)
            intArrRand1[i] = (int) (Math.random() * 100);

        System.out.println("Array values: " + java.util.Arrays.toString(intArrRand1));
        System.out.println("Sum of elements that are greater than 40: " + MyTestMethod.calcSum(intArrRand1, 40));

        System.out.println();

        Double[] doubleArrRand1 = new Double[10];
        for (int i = 0; i < doubleArrRand1.length; i++)
            doubleArrRand1[i] = (double) Math.round(Math.random() * 100);

        System.out.println("Array values: " + java.util.Arrays.toString(doubleArrRand));
        System.out.println("Sum of elements that are greater than 40.0: " + MyTestMethod.calcSum(doubleArrRand1, 50.0));

    }
}
