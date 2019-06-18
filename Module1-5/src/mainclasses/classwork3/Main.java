package mainclasses.classwork3;

import com.brainacad.classesAndInstances.Additional_Practice_Works.AWP2.Dog;
import tereshchenko_roman.classesAndInstances.Additional_Practice_Works.AWP3.Person;

public class Main {

    public static void main(String[] args) {

        // Создать человека Васю

        Person person = new Person("Vasya", 1987);

//        person.setName("Vasya");
        person.setAge(12);
        person.setGender("Male");

        // Создать собаку тузика
        Dog dog = new Dog();
        dog.setName("Tyzik");
        dog.setAge(2);
        person.setDog(dog);

        // У Васи была собака Тузик

        Person person2 = new Person("Olya", 2000);
//        person.setName("Olya");
        person2.setAge(8);
        person2.setGender("Female");

        System.out.println(person2.getDog().getName());


        Car car = new Car(200, 1);
        Car car2 = new Car();


    }

}
