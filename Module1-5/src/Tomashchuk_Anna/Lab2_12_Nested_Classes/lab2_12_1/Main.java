package Tomashchuk_Anna.Lab2_12_Nested_Classes.lab2_12_1;

public class Main {
    public static void main(String[] args) {
        // lab 2_12-1
        MyPhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.addPhoneNumber("Alex", "0505552211");
        myPhoneBook.addPhoneNumber("Ivan", "0551118855");
        myPhoneBook.addPhoneNumber("Peter", "0930302277");
        myPhoneBook.addPhoneNumber("Nadia", "0636472910");
        myPhoneBook.addPhoneNumber("Sveta", "0689002134");

        myPhoneBook.printPhoneBook();

    }
}
