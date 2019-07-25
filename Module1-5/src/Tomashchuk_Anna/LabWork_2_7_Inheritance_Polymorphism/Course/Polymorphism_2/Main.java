package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Course.Polymorphism_2;

public class Main {
    public static void main(String[] args) {
        // Позднее связывание или динамическое связывание, когда методы вызываются в рантайме
        // Вы не знаете какой код здесь выполнится, зависит тот того что в массиве нам прийдет
        Car[] myCars = {new Car(), new SportCar(), new Truck()};
        for (Car myCar : myCars) {
            myCar.move();
        }
    }
}
