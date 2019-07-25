package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Course.Course_9;

public class Car {
    public Car getNewCar(){ // getNewCar() -сигнатура
        // Это шаблоны - будем учить позже
        return new Car();
    }
}
class SportCar extends Car{
    @Override
    public SportCar getNewCar(){
        return new SportCar();
    }
}
