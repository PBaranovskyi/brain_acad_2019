package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Equals;

public class Car {
    private long id;

    public Car(long id) {
        this.id = id;
    }
}

class Main {
    public static void main(String[] args) {
        Car myCar1 = new Car(12345);
        Car myCar2 = new Car(12345);
        Car myCar3 = myCar1;

        System.out.println(myCar1.equals(myCar2)); // false - сравниваются ссылки. Это разные области памяти
        System.out.println(myCar1.equals(myCar3)); // true - у Car1 и Car3 область памяти одинаковая
    }
}
