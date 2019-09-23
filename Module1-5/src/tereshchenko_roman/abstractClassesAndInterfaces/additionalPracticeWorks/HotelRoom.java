package tereshchenko_roman.abstractClassesAndInterfaces.additionalPracticeWorks;

public class HotelRoom {

    private int roomNumber;
    private Sportsman place1;
    private Sportsman place2;
    private Sportsman place3;
    private Sportsman place4;

    public HotelRoom (int roomNumber) { this.roomNumber = roomNumber;}

    public Sportsman getPlace1() {
        return place1;
    }

    public void setPlace1(Sportsman sportsman) {
        this.place1 = sportsman;
    }

    public Sportsman getPlace2() {
        return place2;
    }

    public void setPlace2(Sportsman sportsman) {
        this.place2 = sportsman;
    }

    public Sportsman getPlace3() {
        return place3;
    }

    public void setPlace3(Sportsman sportsman) {
        this.place3 = sportsman;
    }

    public Sportsman getPlace4() {
        return place4;
    }

    public void setPlace4(Sportsman sportsman) {
        this.place4 = sportsman;
    }



}
