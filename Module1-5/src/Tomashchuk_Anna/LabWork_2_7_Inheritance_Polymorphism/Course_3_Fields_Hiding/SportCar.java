package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Course_3_Fields_Hiding;

public class SportCar extends Car {
    protected int maxSpeed=280;
    public void testMethod2(){
        System.out.println(maxSpeed);
    }
}
