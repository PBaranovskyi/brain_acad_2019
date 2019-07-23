package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Course.Course_5_hashCode;

public class Main {
    public static void main(String[] args) {
        Car myCar1 = new Car(12345,180);
        Car myCar2 = new Car(12345,180);
        Car myCar3 = new Car(44444,120);

        System.out.println(myCar1.hashCode()); // 23934342
        System.out.println(myCar2.hashCode()); // 22307196
        System.out.println(myCar3.hashCode()); // 10568834
        System.out.println();
        System.out.println(myCar1.hashCode()); // 23934342 hashCode- возвращает одинаковое значение для одного объекта
        // напримеи, еслу будем 3 раза запускать, то будет все-равно одинаковое значение
    }
}
