package LabWork_2_1.Add_Work_4;

import Tomashchuk_Anna.LabWork_2_1.Add_Work_2.Dog;

public class Person {
    public String name;
    public int age;
    public String gender;
    public int yearOfBirth;
    public Dog dog;

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Dog getDog() {
        return dog;
    }

    public void setName(String name) {this.name=name;}
    public String getName() {return name;}

    public void setAge(int age) {this.age=age;}
    public int getAge() {return age;}

    public void setGender(String gender) {this.gender=gender;}
    public String getGender() {return gender;}

    public void setYearOfBirth(int yearOfBirth) {this.yearOfBirth=yearOfBirth;}
    public int getYearOfBirth() {return yearOfBirth;}
}
