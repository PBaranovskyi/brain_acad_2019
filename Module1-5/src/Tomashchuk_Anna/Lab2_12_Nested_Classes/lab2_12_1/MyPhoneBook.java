package Tomashchuk_Anna.Lab2_12_Nested_Classes.lab2_12_1;

import java.util.Arrays;

public class MyPhoneBook {
    // lab 2_12_1
    //Add to class MyPhoneBook private field phoneNumbers as array of PhoneNumber(array length of 10)
    private PhoneNumber[] arrayPhone = new PhoneNumber[10];

    static class PhoneNumber {
        private String name,
                phone;
        // constructor with two parameters (name, phone)
        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getPhone() {
            return phone;
        }
        public void setPhone(String phone) {
            this.phone = phone;
        }

       //Override the toString() method in PhoneNumber to return information about name and phone number
        @Override
        public String toString() {
            return "PhoneNumber: name=" + name + ", phone=" + phone;
        }
    }

    // method addPhoneNumber() use it to create new PhoneNumber object and
    //pass it to next available array element
    public void addPhoneNumber(String name, String phone) {
        for (int freePosition = 0; freePosition < arrayPhone.length; freePosition++) {
            if (arrayPhone[freePosition] == null) {
                arrayPhone[freePosition] = new PhoneNumber(name, phone);
                break;
            }
        }
    }

    //  method printPhoneBook() - iterates over phoneNumbers array in loop
    // and print name and phone number information of each record to console.
    public void printPhoneBook() {
        int index = 0;
        while (index < arrayPhone.length && arrayPhone[index] != null) {
            System.out.println(arrayPhone[index++]);
        }
    }

}
