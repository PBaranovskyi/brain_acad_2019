package tereshchenko_roman.nestedClasses;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {
    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

    public void addPhoneNumber(String name, String phone) {
        for (int i = 0; i < phoneNumbers.length; i++) {
            if (phoneNumbers[i] == null) {
                phoneNumbers[i] = new PhoneNumber(name, phone);
                break;
            }
        }
    }

    public void printPhoneBook() {
        for (PhoneNumber phoneNumber : phoneNumbers) {
            if (phoneNumber != null) {
                System.out.println(phoneNumber);
            }
        }
    }

    public void sortByName() {
        Arrays.sort(phoneNumbers, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                PhoneNumber obj_1 = (PhoneNumber) o1;
                PhoneNumber obj_2 = (PhoneNumber) o2;
                String name_1 = obj_1.getName();
                String name_2 = obj_2.getName();
                return name_1.compareTo(name_2);
            }
        });
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

    static class PhoneNumber {
        private String name = "DefaultName";
        private String phone = "0123456789";

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
