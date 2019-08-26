package bilan_max.NestedClasse;

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

        // lab 2_12_2
        myPhoneBook.addPhoneNumber("Dima", "0676669977");
        myPhoneBook.addPhoneNumber("Masha", "0971234567");
        myPhoneBook.addPhoneNumber("Ksenia", "0989876543");
        myPhoneBook.addPhoneNumber("Egor", "0550909090");
        myPhoneBook.addPhoneNumber("Igor", "0631112233");

        System.out.println("--------------------------------------");
        System.out.println("Before sort:");
        myPhoneBook.printPhoneBook();
        myPhoneBook.sortByName();
        System.out.println("After sort by name:");
        myPhoneBook.printPhoneBook();

        myPhoneBook.sortByPhoneNumber();
        System.out.println("After sort by phone:");
        myPhoneBook.printPhoneBook();
    }
}

