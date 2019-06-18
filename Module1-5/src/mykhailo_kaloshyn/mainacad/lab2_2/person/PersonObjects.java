package mykhailo_kaloshyn.mainacad.lab2_2.person;

import static com.mainacad.lab2_2.person.Person.personCreature;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person();
        personCreature(person1, "Mike", "Robson", 33);

        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println(person1.getAge());
        System.out.println(person1.getGender());
        System.out.println(person1.getPhoneNumber());

    }
}
