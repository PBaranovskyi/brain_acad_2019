package Tomashchuk_Anna.LabWork_2_2_Methods.Lab224;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();

        person.PersonDemo("Оля", "Петрова", "Female");
        person.PersonDemo("Оля", "Петрова");
        System.out.println();

        person.PersonDemo1("Петрова", "Female");
        person.PersonDemo(12, 504406864);
        person.PersonDemo(12);
        person.PersonDemo("Оля", 12);

    }
}
