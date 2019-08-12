package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.Course.Abstract_method_3;

public class Car extends Vehicle {
    // Абстрактный класс, метод , которые можно объявить без имплементации, логики
    // Если Вы хотите создать абстрактный метод, то Вам прийдется создать сначала абстрактный класс
    // Нужно писать логику, нет методов без логики
    // Абстрактные классы нужно оверрайдить
    @Override
    public void move() {
        System.out.println("Car move");
    }

}
