package Tomashchuk_Anna.Lab2_12_Nested_Classes.lab2_12_3;

public class Main {
    public static void main(String[] args) {
        //Add to method main() code that creates MyPhone object, invoke swichOn() method
        //and then invoke call() method with argument of value 1

        MyPhone myPhone = new MyPhone();
        myPhone.swichOn();

        System.out.println("Telephone numbers shortcut:");
        myPhone.phonebook.printPhoneBook();

        myPhone.call(1);
    }
}
