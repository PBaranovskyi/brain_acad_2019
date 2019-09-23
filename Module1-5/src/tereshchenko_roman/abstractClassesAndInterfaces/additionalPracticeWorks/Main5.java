package tereshchenko_roman.abstractClassesAndInterfaces.additionalPracticeWorks;

public class Main5 {

    public static void main(String[] args) {
        HotelRoom[] rooms = new HotelRoom[200];

        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new HotelRoom(i + 1);
        }

        Hotel hotel1 = new Hotel(rooms);
    }
}
