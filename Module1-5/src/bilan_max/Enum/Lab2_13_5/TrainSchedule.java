package bilan_max.Enum.Lab2_13_5;

import java.util.Arrays;
import java.util.Scanner;

public class TrainSchedule {
    private Train[] trains;
    private int numberTrains;

    public TrainSchedule(int number) {
        trains = new Train[number];
    }

    public int getNumber() {
        return numberTrains;
    }

    class Train {
        private int number;
        private String stationDispatch,
                stationArrival;
        private String timeDispatch,
                timeArrival;
        private DayOfWeek[] days;

        public Train(int number) {
            this.number = number;
        }

        public void setStationDispatch(String stationDispatch) {
            this.stationDispatch = stationDispatch;
        }

        public void setStationArrival(String stationArrival) {
            this.stationArrival = stationArrival;
        }

        public void setTimeDispatch(String timeDispatch) {
            this.timeDispatch = timeDispatch;
        }

        public void setTimeArrival(String timeArrival) {
            this.timeArrival = timeArrival;
        }

        public void setDays(DayOfWeek[] days) {
            this.days = days;
        }

        public int getNumber() {
            return number;
        }

        public String getStationDispatch() {
            return stationDispatch;
        }

        public String getStationArrival() {
            return stationArrival;
        }

        public String getTimeDispatch() {
            return timeDispatch;
        }

        public String getTimeArrival() {
            return timeArrival;
        }

        public DayOfWeek[] getDays() {
            return days;
        }

        @Override
        public String toString() {
            return "Train: number=" + number +
                    ", stationDispatch=" + stationDispatch +
                    ", stationArrival=" + stationArrival +
                    ", timeDispatch=" + timeDispatch +
                    ", timeArrival=" + timeArrival +
                    ", days=" + Arrays.toString(days);
        }
    }

    public void addTrain() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the train data: nomer = ");
        Train train = new Train(scanner.nextInt());
        System.out.print("Enter station dispatch = ");

        train.setStationDispatch(scanner.next());
        System.out.print("Enter station arrival = ");

        train.setStationArrival(scanner.next());
        System.out.print("Enter time dispatch = ");

        train.setTimeDispatch(scanner.next());
        System.out.print("Enter time arrival = ");

        train.setTimeArrival(scanner.next());
        System.out.print("Enter days of the week through the space: ");

        scanner.nextLine();
        String[] dd = scanner.nextLine().split(" ");
        DayOfWeek[] dw = new DayOfWeek[dd.length];
        for(int j=0; j<dw.length; j++) {
            dw[j] = DayOfWeek.valueOf(dd[j].toUpperCase());
        }
        train.setDays(dw);

        if (numberTrains < trains.length -1) {
            trains[numberTrains++] = train;
        }

        System.out.println();
    }

    public void printTrains() {
        System.out.println("All trains:");
        for (int i=0; i<numberTrains; i++) {
            System.out.println(trains[i]);
        }
    }

    public void searchTrains(String stationDispatch, String stationArrival, DayOfWeek day) {
        System.out.println("Found the train:");
        for(int i=0; i<numberTrains; i++) {
            if (trains[i].getStationDispatch().equals(stationDispatch) &&
                    trains[i].getStationArrival().equals(stationArrival)) {
                for(DayOfWeek currentDay : trains[i].getDays()) {
                    if (currentDay == day || currentDay.compareTo(day) > 0) {
                        System.out.println(trains[i]);
                        break;
                    }
                }
            }
        }
    }

}