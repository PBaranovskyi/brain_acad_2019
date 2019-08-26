package Tomashchuk_Anna.Lab2_12_Nested_Classes.lab2_12_3;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhone {

    MyPhoneBook phonebook;

   //Add to class MyPhone constructor with no arguments to initialize the field phonebook
    public MyPhone() {
        phonebook = new MyPhoneBook();
    }

    //Rewrite class MyPhoneBook to make it as inner class (non-static) of MyPhone class
//(move class MyPhoneBook code inside MyPhone class)
    public class MyPhoneBook {

        private PhoneNumber[] arrayPhone = new PhoneNumber[10];

        class PhoneNumber {
            private String name,
                    phone;
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

            @Override
            public String toString() {
                return "name=" + name + ", phone=" + phone;
            }
        }

        public void addPhoneNumber(String name, String phone) {
            for (int freePosition = 0; freePosition < arrayPhone.length; freePosition++) {
                if (arrayPhone[freePosition] == null) {
                    arrayPhone[freePosition] = new PhoneNumber(name, phone);
                    break;
                }
            }
        }

        public void printPhoneBook() {
            int index = 0;
            while (index < arrayPhone.length && arrayPhone[index] != null) {
                System.out.println(arrayPhone[index++]);
            }
        }

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

    //Add to class MyPhone public method swichOn(), which print message “Loading PhoneBook records…”
    // and create MyPhoneBook object and add to it ten phone number records. Then print to console “OK!”;
    public void swichOn() {
        System.out.println("Loading PhoneBook records…");
        phonebook.addPhoneNumber("Alex", "0505552211");
        phonebook.addPhoneNumber("Ivan", "0551118855");
        phonebook.addPhoneNumber("Peter", "0930302277");
        phonebook.addPhoneNumber("Nadia", "0636472910");
        phonebook.addPhoneNumber("Sveta", "0689002134");
        phonebook.addPhoneNumber("Dima", "0676669977");
        phonebook.addPhoneNumber("Masha", "0971234567");
        phonebook.addPhoneNumber("Ksenia", "0989876543");
        phonebook.addPhoneNumber("Egor", "0550909090");
        phonebook.addPhoneNumber("Igor", "0631112233");
        System.out.println("OK!");
    }

    //Add to class MyPhone method call(int), which prints to console message “Calling to”
    //and full information from MyPhoneBook element (by index of array).
    public void call(int number) {
        System.out.println("Calling to: " + phonebook.arrayPhone[number]);
    }

}
