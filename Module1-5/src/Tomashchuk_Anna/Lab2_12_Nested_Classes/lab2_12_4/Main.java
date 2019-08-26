package Tomashchuk_Anna.Lab2_12_Nested_Classes.lab2_12_4;

public class Main {
    public static void main(String[] args) {
        MyPhone myPhone = new MyPhone();
        myPhone.swichOn();

        System.out.println("Telephone numbers shortcut:");
        myPhone.phonebook.printPhoneBook();

        myPhone.call(3);
    }
}
