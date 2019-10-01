package LabWork_2_1.Add_Work_8;

import Tomashchuk_Anna.LabWork_2_1.Add_Work_6.Dog;

public class Main {
    public static void main(String[] args) {
        // Создать человека Васю
        Person person = new Person();
        person.setName("Vasya");
        person.setAge(15);
        person.setGender("Male");
        person.setYearOfBirth(2003);

        // Создать собаку тузика
        Dog dog = new Dog();
        dog.setName("Тузик");
        dog.setAge(3);

        // У Васи была собака Тузик
        person.setDog(dog);

        System.out.println("Person's name: " + person.getName());
        System.out.println("Person's age: " + person.getAge());
        System.out.println("Person's Gend: " + person.getGender());
        System.out.println("Person's YearOfBirth: " + person.getYearOfBirth());
        System.out.println("Person " + person.getName() + " has a dog: " + dog.getName());
        System.out.println("Dog's age: " + dog.getAge());


    }
}
