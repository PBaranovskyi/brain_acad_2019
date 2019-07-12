package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Course_2;

public class SportCar extends Car {
    // Метод с таким же именем, сигнатурой и параметрами - перезаписывается
    @Override
    public void testMethod(){
        System.out.println("SportCar");
    }
}
