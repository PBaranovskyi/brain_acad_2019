package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Course.Constructors_chaining_10;

public class SportCar extends Car {
    // Java-машина прописываеи super без параметров, автоматически, первой строчкой, перед вызовом конструктора SportCar()
    // super - всегда первая строчка, второй она быть не может
    // super(); - мы его не пишем но он евть по default
    public SportCar() { // SportCar() - это конструктор
        System.out.println("SportCar Constructor");
    }
}
