package com.brainacad.classesAndInstances.Additional_Practice_Works.AWP3;

import com.brainacad.classesAndInstances.Additional_Practice_Works.AWP2.Dog;

//AWP 3

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Vasya");
        person1.setAge(12);
        person1.setGender("M");
        person1.setYearOfBirth(1981);
        System.out.println(person1.getName() + ", " + person1.getAge() + ", " + person1.getGender() + ", " + person1.getYearOfBirth());


        Dog dog1 = new Dog();
        dog1.setName("Sharik");
        dog1.setAge(3);

        Person person2 = new Person();
        person2.setName("Petya");
        person2.setAge(10);
        person2.setGender("M");
        person2.setYearOfBirth(1980);

        person2.setDog(dog1);

        System.out.println(person2);

    }
}
