package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Course.Constructors_chaining_11_with_Param;

public class SportCar extends Car {
    public SportCar(long id){ // Конструктор с параметрами
        super(id); // Если Суперконструктор с параметрами, то нужно явно прописывать его super(id);
        System.out.println("SportCar Constructor");
    }
}
