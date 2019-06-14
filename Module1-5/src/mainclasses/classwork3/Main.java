package mainclasses.classwork3;

import com.brainacad.classesAndInstances.Additional_Practice_Works.AWP3.Person;
import com.brainacad.classesAndInstances.Additional_Practice_Works.AWP2.Dog;

public class Main {

    public static void main(String[] args) {

        // Создать человека Васю

        Person person = new Person();
        person.setName("Vasya");
        person.setAge(12);
        person.setGender("Male");

        // Создать собаку тузика
        Dog dog = new Dog();
        dog.setName("Tyzik");
        dog.setAge(2);
        person.setDog(dog);

        // У Васи была собака Тузик

        Person person2 = new Person();
        person.setName("Olya");
        person.setAge(8);
        person.setGender("Female");






    }

}
