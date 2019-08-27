package mykhailo_kaloshyn.mainacad.testenum.testenum3;

import java.util.Arrays;
import java.util.Scanner;

public class TrainSchedule {

    private Train[] trains;

    public TrainSchedule(Train[] trains) {
        this.trains = trains;
    }

    public Train[] getTrains() {
        return trains;
    }

    public void setTrains(Train[] trains) {
        this.trains = trains;
    }

    public void addTrain() {
        boolean doTask = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter dispatch station: ");
            String disStation = sc.nextLine();
            System.out.println("Enter arrival station: ");
            String arrivStation = sc.nextLine();
            System.out.println("Enter dispatch time: ");
            String dispTime = sc.nextLine();
            System.out.println("Enter arrival time: ");
            String arrivTime = sc.nextLine();

            DayOfWeek[] arrDays = new DayOfWeek[7];
            for (int i = 0; i < 7; i++) {
                System.out.println("Enter day of week: ");
                String day = sc.nextLine();
                arrDays[i] = DayOfWeek.valueOf(day);
                System.out.println("Do you want to add another day for this train: Y/N?");
                String oneMoreDay = sc.nextLine();
                if (oneMoreDay.equals("N")) {
                    break;
                }
            }

            System.out.println();

            System.out.println("Enter train number: ");
            int trainNumber = sc.nextInt();

            Train train = new Train(trainNumber);
            train.setStationDispatch(disStation);
            train.setStationArrival(arrivStation);
            train.setTimeDispatch(dispTime);
            train.setTimeArrival(arrivTime);
            train.setDays(arrDays);

            int len = this.trains.length;
            Train[] trainsPlusOne = new Train[len + 1];
            for (int i = 0; i < len; i++) {
                trainsPlusOne[i] = trains[i];
            }
            trainsPlusOne[len] = train;
            this.setTrains(trainsPlusOne);

            Scanner sc2 = new Scanner(System.in);
            System.out.println("Do you want to correspond another train? Y/N");
            String doAct = sc2.nextLine();

            if (doAct.equals("Y")) {
                continue;
            } else {
                doTask = false;
            }

        } while (doTask == true);

    }


    public void printTrains() {

        for (Train trainToPrint : this.trains) {

            System.out.println();
            System.out.println(trainToPrint);
        }

    }

    public void searchForTrain(String dispatchStation, String arrivalStation, DayOfWeek day) {
        for (int i = 0; i < this.trains.length; i++) {
            if (dispatchStation.equals(trains[i].getStationDispatch()) &&
                    arrivalStation.equals(trains[i].getStationArrival())) {
                DayOfWeek[] arr = this.trains[i].getDays();
                for (int j = 0; j < 7; j++) {
                    if (arr[j] == day) {
                        System.out.println("The suggested trains: ");
                        System.out.println(this.trains[i]);
                        System.out.println();
                        break;
                    }
                }
            }
        }
        System.out.println("Searching process is finished!");
    }

    class Train {

        private int number;
        private String stationDispatch;
        private String stationArrival;
        private String timeDispatch;
        private String timeArrival;
        private DayOfWeek[] days;

        public Train(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getStationDispatch() {
            return stationDispatch;
        }

        public void setStationDispatch(String stationDispatch) {
            this.stationDispatch = stationDispatch;
        }

        public String getStationArrival() {
            return stationArrival;
        }

        public void setStationArrival(String stationArrival) {
            this.stationArrival = stationArrival;
        }

        public String getTimeDispatch() {
            return timeDispatch;
        }

        public void setTimeDispatch(String timeDispatch) {
            this.timeDispatch = timeDispatch;
        }

        public String getTimeArrival() {
            return timeArrival;
        }

        public void setTimeArrival(String timeArrival) {
            this.timeArrival = timeArrival;
        }

        public DayOfWeek[] getDays() {
            return days;
        }

        public void setDays(DayOfWeek[] days) {
            this.days = days;
        }


        @Override
        public String toString() {
            return "Train number: " + number + ";\nStation dispatch: " + stationDispatch +
                    "; time dispatch: " + timeDispatch + ";\nStation arrival: " + stationArrival +
                    "; time arrival: " + timeArrival + ";\ndays: " + Arrays.toString(days);
        }
    }
}
