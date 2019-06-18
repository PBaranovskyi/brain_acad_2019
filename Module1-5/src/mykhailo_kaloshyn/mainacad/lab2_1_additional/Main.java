package mykhailo_kaloshyn.mainacad.lab2_1_additional;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Person person1 = new Person();
        Person person2 = new Person();
        Bus bus1 = new Bus();

        /*dog1.name = "Tuzik";
        dog1.age = 5;*/

        dog1.setName("Tuzik");
        dog1.setAge(5);

        /*person1.name = "Vasya";
        person1.age = 12;
        person1.gender = "M";
        person1.yearOfBirth = 1982;
        person1.dog = dog1;*/

        person1.setName("Vasya");
        person1.setAge(12);
        person1.setGender("M");
        person1.setYearOfBirth(1982);
        person1.setDog(dog1);

        person2.setName("Igor");

        bus1.setSeats(5);

        System.out.println("Dog's name: " + dog1.getName() + "; age: " + dog1.getAge());

        System.out.println("Person's name: " + person1.getName() + "; age: " + person1.getAge() + "; gender: " +
                person1.getGender() + "; year of birth: " + person1.getYearOfBirth() + "; person's dog: " +
                person1.getDog().getName());

        System.out.println("Bus'es seats before having a driver: " + bus1.getSeats() + "; bus'es driver: " + bus1.getDriver());

        bus1.setDriver(person1);

        System.out.println("Bus'es seats after having a driver: " + bus1.getSeats() + "; bus'es driver: " + bus1.getDriver().getName());

        bus1.setDriver(person2);

        System.out.println("Bus'es seats after replacing a driver: " + bus1.getSeats() + "; bus'es driver: " + bus1.getDriver().getName());

    }
}
