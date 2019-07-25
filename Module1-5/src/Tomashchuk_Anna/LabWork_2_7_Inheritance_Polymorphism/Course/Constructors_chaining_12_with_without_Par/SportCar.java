package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Course.Constructors_chaining_12_with_without_Par;

public class SportCar extends Car {
    // перед конструктором SportCar(long id), Java сама сгенерит конструктоор super() без параметров
    public SportCar(long id){
        System.out.println("SportCar Constructor ");
    }
}
