package com.brainacad.classes_and_instances.Animal;

public class MainClassAnimal {
    public static void main(String[] args) {

        //создать 2 объекта - животные
        Animal obj1 = new Animal();
        Animal obj2 = new Animal();

        //дать им имена
        //один объект - "обезьянка Оля"
        //второй объект - "волк Петя"

        obj1.setName("обезьянка Оля");
        obj2.setName("волк Петя");

        //присвоить им количество ног
        obj1.setLegs(2);
        obj2.setLegs(4);

        // присвоить им вид млекопитающие
        obj1.setMamal(true);
        obj2.setMamal(true);

        //вывести их на экран
        System.out.println(obj1.getName());
        System.out.println(obj2.getName());
        System.out.println(obj1.getLegs());
        System.out.println(obj2.getLegs());
        System.out.println(obj1.getMamal());
        System.out.println(obj2.getMamal());

    }
}
