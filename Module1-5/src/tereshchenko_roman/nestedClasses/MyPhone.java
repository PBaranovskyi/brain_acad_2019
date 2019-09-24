package tereshchenko_roman.nestedClasses;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhone {

    MyPhoneBook phonebook;

    public MyPhone() {
        phonebook = new MyPhoneBook();
    }

    public class MyPhoneBook {
        private MyPhoneBook.PhoneNumber[] phoneNumbers = new MyPhoneBook.PhoneNumber[10];

        public void addPhoneNumber(String name, String phone) {
            for (int i = 0; i < phoneNumbers.length; i++) {
                if (phoneNumbers[i] == null) {
                    phoneNumbers[i] = new MyPhoneBook.PhoneNumber(name, phone);
                    break;
                }
            }
        }

        public void printPhoneBook() {
            for (MyPhoneBook.PhoneNumber phoneNumber : phoneNumbers) {
                if (phoneNumber != null) {
                    System.out.println(phoneNumber);
                }
            }
        }

        public void sortByName() {
            Arrays.sort(phoneNumbers, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        }

        public void sortByPhoneNumber() {
            Arrays.sort(phoneNumbers, new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    String phone_1 = ((PhoneNumber) o1).getPhone();
                    String phone_2 = ((PhoneNumber) o2).getPhone();
                    return phone_1.compareTo(phone_2);
                }
            });
        }

        class PhoneNumber {
            private String name;
            private String phone;

            public PhoneNumber(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            public String getName() {
                return name;
            }

            public String getPhone() {
                return phone;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            @Override
            public String toString() {
                return "Name: " + getName() + "; Phone: " + getPhone();
            }
        }
    }

    //Lab work 2_12_3
    public void switchOn() {

        System.out.println("Loading PhoneBook records…");

        MyPhoneBook phoneBook1 = new MyPhoneBook();
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

    public void call(int number) {
        System.out.println("Calling to: " + phonebook.phoneNumbers[number]);
    }

//Lab work 2_12_4

    class Camera {
    }

    class Bluetooth {
    }

    class MemoryCard {
    }

    class SimCard {
    }

    class PowerOnButton {
    }

    class PhoneBattery {
    }

    class PhoneDisplay {
    }

    class PhoneSpeaker {
    }

}
