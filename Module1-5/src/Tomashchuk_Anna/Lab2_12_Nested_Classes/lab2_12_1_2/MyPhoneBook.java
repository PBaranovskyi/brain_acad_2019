package Tomashchuk_Anna.Lab2_12_Nested_Classes.lab2_12_1_2;

import java.util.Arrays;
import java.util.Comparator;

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

    // Provide code in sortByName() method to sort PhoneNumbers array by name (using
    //Comparator interface and anonymous class).
    public void sortByName() {
        Arrays.sort(arrayPhone, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                PhoneNumber obj_1 = (PhoneNumber)o1;
                PhoneNumber obj_2 = (PhoneNumber)o2;
                String name_1 = obj_1.getName();
                String name_2 = obj_2.getName();
                return name_1.compareTo(name_2);
            }
        });
    }
    public void sortByPhoneNumber() {
        Arrays.sort(arrayPhone, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String phone_1 = ((PhoneNumber)o1).getPhone();
                String phone_2 = ((PhoneNumber)o2).getPhone();
                return phone_1.compareTo(phone_2);
            }
        });
    }
}
