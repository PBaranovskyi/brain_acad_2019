package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.Course.CompareTo_1;

public class Car implements Comparable {
    // Интерфейс - гарантия того, что метод есть
    private int maxSpeed;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int compareTo(Object o){
        // char превращает в int и сравнивает по таблице ASCI-кодов
        // большие буквы вначале в алфавитном порядке
        Car car=(Car)o;
        if(this.maxSpeed>car.maxSpeed) return 1;
        if(this.maxSpeed<car.maxSpeed) return -1;
        return 0;
    }
}
