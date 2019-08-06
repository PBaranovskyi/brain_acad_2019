package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Course.instanceOf;

public class Main {
    public static void main(String[] args) {
        // instanceof - Проверяет или я могу преобразовать тип в другой тип
        // чтобы не падалоо с ошибкой ClassCastException
        Car myCar = new SportCar();
        if (myCar instanceof SportCar) {
            System.out.println("SportCar");
            SportCar myCar2 = (SportCar) myCar;
        }
        if (myCar instanceof Truck) {
            System.out.println("Truck");
            Truck myCar3 = (Truck) myCar;
        }
    }
}
