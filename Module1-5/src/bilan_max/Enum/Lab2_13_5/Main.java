package bilan_max.Enum.Lab2_13_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter schedules size: ");
    TrainSchedule trainSchedule = new TrainSchedule(scanner.nextInt());

        System.out.print("Enter the number of trains (1..: " +
                trainSchedule.getNumber() + ") -> ");
    int number = scanner.nextInt();
        for(int i=0; i<number; i++) {
        trainSchedule.addTrain();
    }

        trainSchedule.printTrains();

        trainSchedule.searchTrains("Kiev", "Lvov", DayOfWeek.THURSDAY);
}

}

