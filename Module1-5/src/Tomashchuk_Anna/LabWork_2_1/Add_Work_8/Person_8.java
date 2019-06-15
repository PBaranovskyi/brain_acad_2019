package Tomashchuk_Anna.LabWork_2_1.Add_Work_8;

import Tomashchuk_Anna.LabWork_2_1.Add_Work_6.Dog;

public class Person_8 {
    private String name;
    private int age;
    private String gender;
    private int yearOfBirth;
    private Dog dog; // null по умолчанию
    //  private static Dog dog=new Dog(); собака пустая - так првильно


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setDog() {
        this.dog = dog;
    }

    public Dog getDog() {
        return dog;
    }
}
