package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Course.Course_7_super;

public class Car {
    public String toString(){
        return "This is Car";
    }
}
class SportCar extends Car{
    public String toString(){
        return super.toString()+":SportCar";
    }
}
