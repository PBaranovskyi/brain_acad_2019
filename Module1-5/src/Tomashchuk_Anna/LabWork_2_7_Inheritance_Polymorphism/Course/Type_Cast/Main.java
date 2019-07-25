package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Course.Type_Cast;

public class Main {
    public static void main(String[] args) {
        Car myCar=new SportCar();
        SportCar myCar2=(SportCar)myCar; // Ok
        System.out.println(myCar2);

       // Truck myCar3=(Truck)myCar; // ClassCastException:
        // Преобразование со String в Object всегда можно сделать, потому что String - это ребенок Object
        // а вот наоборот не всегда можно сделать - валится с ошибкой ClassCastException
    }
}
