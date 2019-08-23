package tereshchenko_roman.nestedClasses;

public class Main {

    public static void main(String[] args) {

        MyPhoneBook phoneBook1 = new MyPhoneBook();

        phoneBook1.addPhoneNumber("Vasya", "123-45-67");
        phoneBook1.addPhoneNumber("Petya", "234-56-78");
        phoneBook1.addPhoneNumber("Lena", "345-67-89");
        phoneBook1.addPhoneNumber("Tanya", "456-78-90");
        phoneBook1.addPhoneNumber("Sveta", "567-89-01");

        phoneBook1.printPhoneBook();


        phoneBook1.addPhoneNumber("Vasya1", "345-67-89");
        phoneBook1.addPhoneNumber("Petya1", "234-56-78");
        phoneBook1.addPhoneNumber("Lena1", "345-67-89");
        phoneBook1.addPhoneNumber("Tanya1", "234-56-78");
        phoneBook1.addPhoneNumber("Sveta1", "567-89-01");

        System.out.println();
        System.out.println("Before sorting");
        phoneBook1.printPhoneBook();

        System.out.println();
        System.out.println("Sort by name");
        phoneBook1.sortByName();
        phoneBook1.printPhoneBook();

        System.out.println();
        System.out.println("Sort by phone");
        phoneBook1.sortByPhoneNumber();
        phoneBook1.printPhoneBook();
    }
}
