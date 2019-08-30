package tereshchenko_roman.theEnums.theEnums3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of trains in the schedule: ");
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
