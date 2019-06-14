package com.brainacad.classesAndInstances.Additional_Practice_Works.AWP2;

public class MainDog {
    public static void main(String[] args) {
        Dog dog1 =  new Dog();
        dog1.setAge(5);
        dog1.setName("Sharik");
        System.out.println("The dog's name is " + dog1.getName() + ". " + "The dog is " + dog1.getAge() + " years old.");
    }
}
