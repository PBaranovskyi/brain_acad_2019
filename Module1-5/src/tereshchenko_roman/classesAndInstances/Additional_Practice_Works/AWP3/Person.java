package com.brainacad.classesAndInstances.Additional_Practice_Works.AWP3;

import com.brainacad.classesAndInstances.Additional_Practice_Works.AWP2.Dog;

import javax.swing.plaf.PanelUI;

public class Person {
    private String name;
    private int age;
    private String gender;
    private int yearOfBirth;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

//    AWP4

    private Dog dog = new Dog();

    public void setDog(Dog dog){
        this.dog = dog;
    }

    public Dog getDog(){
        return dog;
    }
}
