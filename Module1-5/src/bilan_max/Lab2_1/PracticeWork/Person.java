package bilan_max.Lab2_1.PracticeWork;

public class Person {
    private String name;
    private int age;
    private String gender;
    private int yearOfBirth;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }
    public void setyearOfBirth(int yearOfBirth){
        this.yearOfBirth=yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
