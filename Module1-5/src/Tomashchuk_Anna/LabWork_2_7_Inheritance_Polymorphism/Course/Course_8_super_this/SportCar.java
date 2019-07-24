package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Course.Course_8_super_this;

public class SportCar extends Car {
    protected int maxSpeed = 280;

    public void testSuper() {
        System.out.println(super.maxSpeed); // 160  родительский класс
        System.out.println(this.maxSpeed); //  280  этот клас
    }
}
