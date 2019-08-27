package mykhailo_kaloshyn.mainacad.testenum.testenum3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TrainSchedule.Train[] trainArr = new TrainSchedule.Train[]{};

        TrainSchedule schedule = new TrainSchedule(trainArr);

        schedule.addTrain();

        schedule.printTrains();

        System.out.println("======================================");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dispatch station: ");
        String inputDispStation = sc.nextLine();
        System.out.println("Enter the arrival station: ");
        String inputArrivStation = sc.nextLine();
        System.out.println("Enter day of week: ");
        String inputDay = sc.nextLine();
        DayOfWeek enumInputDay = DayOfWeek.valueOf(inputDay);

        schedule.searchForTrain(inputDispStation, inputArrivStation, enumInputDay);

    }
}
