package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Equals;

import mainclasses.inheritance2.Bear;
import mainclasses.inheritance2.Tiger;

public class equals {
    public static void main(String[] args) {
        Tiger tiger1 = new Tiger(new String("Vasya"), 6);
        Tiger tiger2 = new Tiger(new String("Vasya"), 6);

        tiger1.setColor("grey");
        tiger2.setColor("blue");

        System.out.println(tiger1 == tiger2); // false
        // == сравнивает область памяти. Эти Объекты находятся в п=разных областях памяти

        System.out.println(5 == 5); // true, число 5 - Это примитивны тип, он сравнивается по значениям

        int a = 5;
        int b = 5;
        System.out.println(a == b); // true, число 5 - Это примитивны тип, он сравнивается по значениям
        // Это тоже самое, только запись через переменные a, b


        Bear bear = new Bear();

        System.out.println(tiger1.equals(tiger2)); //true- equals- переопределяет, сравнивает посимвольно
        System.out.println(tiger1.equals(bear)); // false


        long c = 8;

        a = (int) c;

    }
}
