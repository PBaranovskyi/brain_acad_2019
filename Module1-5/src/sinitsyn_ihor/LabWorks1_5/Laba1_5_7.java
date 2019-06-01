package sinitsyn_ihor.LabWorks1_5;

import java.util.Scanner;
//import java.util.stream.LongStream;

public class Laba1_5_7 {

    public static void main(String[] args) {
        System.out.print("Please, enter top edge for number check: ");
        Scanner scanner = new Scanner(System.in);
        Integer topEdge = scanner.nextInt();
        for (int iterative = 1; iterative <= topEdge; iterative++) {
            if (checkForPerfective(iterative)) {
                System.out.println("Perfect number: " + iterative);
            }
        }
    }

    private static boolean checkForPerfective(int number) {
        int summ = 0;
        int counter = 1;
        while (counter < number) {
            if (number % counter == 0) {
                summ += counter;
            }
            counter++;
        }
        return summ == number;
    }
/*
    public static void main(String[] args) {
        System.out.println("Enter top edge for number check");
        LongStream.rangeClosed(2, new Scanner(System.in).nextInt())
                .filter(num -> {return LongStream.rangeClosed(2, (long) Math.sqrt(num))
                        .reduce(1, (sum, test) -> num % test == 0 ? sum + test + (num / test) : sum) == num;})
                .boxed()
                .forEach(System.out::println);
    }
*/
}


