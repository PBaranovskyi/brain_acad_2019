package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Course.Course_7_super;

public class Main {
    public static void main(String[] args) {
        Car myCar1 = new Car();
        SportCar myCar2 = new SportCar();

        System.out.println(myCar1); // This is Car
        System.out.println(myCar2); // This is Car:SportCar , super.toString()=This is Car
    }
}
