package tereshchenko_roman.theEnums.theEnums3;

import java.util.Arrays;
import java.util.Scanner;

public class TrainSchedule {

    private Train[] trains;
    private int numberOfTrains = 0;

    public TrainSchedule(int numOfTrainsInSchedule) {
        trains = new Train[numOfTrainsInSchedule];
    }

    public int getNumber() {
        return numberOfTrains;
    }

    class Train {

        private int number;
        private String stationDeparture;
        private String stationArrival;
        private String timeDeparture;
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

        public String getStationDeparture() {
            return stationDeparture;
        }

        public void setStationDeparture(String stationDispatch) {
            this.stationDeparture = stationDispatch;
        }

        public String getStationArrival() {
            return stationArrival;
        }

        public void setStationArrival(String stationArrival) {
            this.stationArrival = stationArrival;
        }

        public String getTimeDeparture() {
            return timeDeparture;
        }

        public void setTimeDeparture(String timeDispatch) {
            this.timeDeparture = timeDispatch;
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
            return "Train number: " + number +
                    "stationDispatch: " + stationDeparture +
                    "stationArrival: " + stationArrival +
                    "timeDispatch: " + timeDeparture +
                    "timtArrival: " + timeArrival +
                    "days: " + Arrays.toString(days)
                    ;
        }
    }

    public void addTrain() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the train number: ");
        Train train = new Train(scan.nextInt());

        System.out.println("Enter the station of departure: ");
        train.setStationDeparture(scan.next());

        System.out.println("Enter the station of arrival: ");
        train.setStationArrival(scan.next());

        System.out.println("Enter the time of departure: ");
        train.setTimeDeparture(scan.next());

        System.out.println("Enter time of arrival: ");
        train.setTimeArrival(scan.next());

        System.out.println("Enter the week days of departure (separated by space): ");
        scan.nextLine();
        String[] scannedDays = scan.nextLine().split(" ");
        DayOfWeek[] daysOfWeek = new DayOfWeek[scannedDays.length];
        for (int i = 0; i < scannedDays.length; i++) {
            daysOfWeek[i] = DayOfWeek.valueOf(scannedDays[i].toUpperCase());
        }
        train.setDays(daysOfWeek);

        if (numberOfTrains < (trains.length - 1)) {
            trains[numberOfTrains] = train;
            numberOfTrains++;
        }
        System.out.println();
    }

    public void printTrains() {
        System.out.println("All trains:");
        for (int i = 0; i < numberOfTrains; i++) {
            System.out.println(trains[i]);
        }
    }

    public void searchTrains(String stationDeparture, String stationArrival, DayOfWeek day) {
        System.out.println("Train found:");
        for(int i=0; i<numberOfTrains; i++) {
            if (trains[i].getStationDeparture().equals(stationDeparture) &&
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

